package com.example.movieproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieDetails : AppCompatActivity() {

    companion object{
        const val TOTAL_TITLE = "title"
        const val TOTAL_DESCRIPTION = "description"
        const val TOTAL_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)
        showDescription()
    }

    fun showDescription(){
        val count1 = intent.getStringExtra(TOTAL_DESCRIPTION)
        val count2 = intent.getStringExtra(TOTAL_TITLE)
        val count3 = intent.getStringExtra(TOTAL_IMAGE)
        descriptionTV2.text = count1
        titleTV2.text=count2


    }
}
