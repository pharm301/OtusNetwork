package ru.otus.otusnetwork

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val items = mutableListOf<MainItem>()
    val adapter = ListAdapter(items)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.adapter = adapter

        App.instance.api.getFilms()
            .enqueue(object : Callback<Root?> {
                override fun onFailure(call: Call<Root?>, t: Throwable) {
                    Log.d("phen", "00")
                }

                override fun onResponse(
                    call: Call<Root?>,
                    response: Response<Root?>
                ) {
                    items.clear()
                    if (response.isSuccessful) {
/*
                        response.body()
                            ?.forEach {
                                items.add(
                                    MainItem(
                                        it.id,
                                        it.title,
                                        it.image
                                    )
                                )
                            }

 */
                    }
                    adapter.notifyDataSetChanged()
                }
            })

    }
}
