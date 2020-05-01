package com.example.movieproject.API

import retrofit2.Call
import retrofit2.http.GET

interface GetDataService {
    @GET("/3/movie/popular?api_key=7bf5a3b637f109b577f650b3c44cb148&language=en-US&page=1")
    fun getData ():Call<ReqResponse>
}