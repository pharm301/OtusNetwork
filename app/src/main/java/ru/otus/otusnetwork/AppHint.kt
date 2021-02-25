package ru.otus.otusnetwork

/*
class App : Application() {

    lateinit var api: Api

    override fun onCreate() {
        super.onCreate()
        instance = this

        initRetrofit()
    }

    private fun initRetrofit() {
        val client = OkHttpClient.Builder()
            .addInterceptor(MyInterceptor())
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(Api::class.java)
    }

    companion object {
        const val BASE_URL = "https://my-json-server.typicode.com/shustreek/demo/"

        lateinit var instance: App
            private set
    }
}

class MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain
            .proceed(chain
                .request()
                .newBuilder()
                .addHeader("Authorization", "Bearer gkengerelitiwoehtwetg")
                .build())
    }

}*/
