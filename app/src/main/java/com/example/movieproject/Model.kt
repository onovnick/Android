package com.example.movieproject

import com.google.gson.annotations.SerializedName

class Model(
    val title: String,
    @SerializedName("overview")
    val description:String,
    @SerializedName("poster_path")
    val imageURL:String
)