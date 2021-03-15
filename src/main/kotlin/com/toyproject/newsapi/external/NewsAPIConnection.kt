package com.toyproject.newsapi.external

import com.toyproject.waterbell.external.NewsAPIResponse
import retrofit2.Call
import retrofit2.http.*


interface NewsAPIConnection {

    @Headers(value = ["accept: application/json", "content-type: application/json"])
    @GET("/v2/top-headlines")
    fun translation(
            @Query("country") country:String,
            @Query("apikey") key:String,
    ): Call<NewsAPIResponse>
}