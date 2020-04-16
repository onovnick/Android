package com.example.movieproject


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class MyAdapter(val models: ArrayList<Model>,val clickListener: itemClickListener) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)

        return ViewHolder(view)
    }

     override fun onBindViewHolder(holder: ViewHolder,position: Int) {
         holder.initialize(models.get(position),clickListener)
    }

    override fun getItemCount()= models.size




    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val imageIv = itemView.findViewById(R.id.ImageIv) as ImageView
        val titleTv = itemView.findViewById(R.id.titleTv) as TextView
        val descriptionTv = itemView.findViewById(R.id.descriptionTv) as TextView
        fun initialize(models:Model,action: itemClickListener){
            titleTv.text=models.title
            descriptionTv.text=models.description
            Picasso.get().load(models.imageURL).into(imageIv)
            itemView .setOnClickListener{
                action.onItemClick(models,adapterPosition)

            }
    }
    }


}

interface itemClickListener{
     fun onItemClick(models:Model,position: Int)




 }

