package com.example.movieproject.API

import com.example.movieproject.Model
import com.google.gson.annotations.SerializedName

class ReqResponse(
    @SerializedName("page") val page:Int,
    @SerializedName("results") val model: List<Model>,
    @SerializedName("total_pages") val pages: Int
) {
}