package com.example.nge_vent.webinar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.nge_vent.R
import com.example.nge_vent.webinar.Webinar

class ListWebinarAdapter (private val listWebinar: ArrayList<Webinar>) : RecyclerView.Adapter<ListWebinarAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.webinar_item,viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listWebinar[position]

        Glide.with(holder.itemView.context)
            .load(hero.photoWebinar)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.nameWebinar
        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listWebinar[holder.adapterPosition]) }

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Webinar)
    }

    override fun getItemCount(): Int {
        return listWebinar.size
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.titleWebinar)
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgWebinar)
    }

}