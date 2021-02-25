package ru.otus.otusnetwork

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_main.*

class ListAdapter(var items: List<MainItem>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(vh: ViewHolder, position: Int) {
        vh.bind(items[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view), LayoutContainer {
        override val containerView: View?
            get() = itemView

        fun bind(item: MainItem) {
            title.text = item.title

            Picasso.get()
                .load(item.image)
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_error)
                .resizeDimen(R.dimen.image_size, R.dimen.image_size)
                .centerCrop()
                .into(image1)

            Glide.with(image2.context)
                .load(item.image)
                .placeholder(R.drawable.ic_image)
                .error(R.drawable.ic_error)
                .override(image2.resources.getDimensionPixelSize(R.dimen.image_size))
                .centerCrop()
                .into(image2)
        }

    }
}