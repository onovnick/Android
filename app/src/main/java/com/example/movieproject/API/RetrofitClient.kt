package com.example.movieproject.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
   // https://api.themoviedb.org/3/movie/popular?api_key=7bf5a3b637f109b577f650b3c44cb148&language=en-US&page=1
    private var retrofit: Retrofit? = null
    private val urlPrimary = "https://api.themoviedb.org"
    fun getRetrofitClient():Retrofit? {
        if(retrofit== null)
            retrofit= Retrofit.Builder().baseUrl(urlPrimary).addConverterFactory(GsonConverterFactory.create()).build()
        return retrofit
    }
}