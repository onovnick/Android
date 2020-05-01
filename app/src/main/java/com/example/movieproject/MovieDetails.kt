package com.example.movieproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.contentValuesOf
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieDetails : AppCompatActivity() {

    companion object{
        const val TOTAL_TITLE = "title"
        const val TOTAL_DESCRIPTION = "description"
        const val TOTAL_IMAGE = "image"
        val ID_KEY="ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        showDescription()
        val courceDetailUrl="https://api.themoviedb.org/3/movie/550?api_key=7bf5a3b637f109b577f650b3c44cb148"

    }

    fun showDescription(){
        val count1 = intent.getStringExtra(TOTAL_DESCRIPTION)
        val count2 = intent.getStringExtra(TOTAL_TITLE)
        Picasso.get().load(intent.getStringExtra(TOTAL_IMAGE)).into(imageTV2)
        descriptionTV2.text = count1
        titleTV2.text=count2



    }
}
