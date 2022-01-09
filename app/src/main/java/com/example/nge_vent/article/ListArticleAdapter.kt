package com.example.nge_vent.article

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.nge_vent.R

class ListArticleAdapter (private val listArticle: ArrayList<Article>) : RecyclerView.Adapter<ListArticleAdapter.ListViewHolder>(){
        private lateinit var onItemClickCallback: OnItemClickCallback

        fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
            this.onItemClickCallback = onItemClickCallback
        }

        override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
            val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.article_item,viewGroup,false)
            return ListViewHolder(view)
        }

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val hero = listArticle[position]

            Glide.with(holder.itemView.context)
                .load(hero.photo)
                .apply(RequestOptions().override(55,55))
                .into(holder.imgPhoto)

            holder.tvName.text = hero.name
            holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listArticle[holder.adapterPosition]) }

        }

        interface OnItemClickCallback {
            fun onItemClicked(data: Article)
        }

        override fun getItemCount(): Int {
            return listArticle.size
        }

        inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tvName: TextView = itemView.findViewById(R.id.item_judul)
            var imgPhoto: ImageView = itemView.findViewById(R.id.item_image)
        }

    }
