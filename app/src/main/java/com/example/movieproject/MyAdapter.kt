package com.example.movieproject


import android.content.Intent
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.view.*

class MyAdapter(val models: ArrayList<Model>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)

        return ViewHolder(view)
    }

     override fun onBindViewHolder(holder: ViewHolder, i: Int) {
         val nikita: Model= models[i]
        holder.titleTv.text= nikita.title
        holder.descriptionTv.text = nikita.description
         Picasso.get().load("https://image.tmdb.org/t/p/w500/"+nikita.imageURL).into(holder.imageIv)
    }

    override fun getItemCount()= models.size




    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val imageIv = itemView.findViewById(R.id.ImageIv) as ImageView
        val titleTv = itemView.findViewById(R.id.titleTv) as TextView
        val descriptionTv = itemView.findViewById(R.id.descriptionTv) as TextView

        init{
            itemView.setOnClickListener {
                val intent = Intent(itemView.context,MovieDetails::class.java)
                intent.putExtra(MovieDetails.TOTAL_DESCRIPTION,descriptionTv.text)
                intent.putExtra(MovieDetails.TOTAL_TITLE,titleTv.text)
                itemView.context.startActivity(intent)
            //    Picasso.get().load("https://image.tmbd.org/t/p/w500/").into(imageIv)
                Picasso.get().load(MovieDetails.TOTAL_IMAGE).into(imageIv)

            }
        }
    }
}

