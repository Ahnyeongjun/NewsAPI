package com.toyproject.newsapi.external

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory


@Service
class NewsAPIService(
        @Value("{NEWSAPI_KEY}")
        val key: String,
) {
    private val newsAPIConnection = Retrofit.Builder()
            .baseUrl("http://newsapi.org")
            .addConverterFactory(JacksonConverterFactory.create(jacksonObjectMapper()))
            .build()
            .create(NewsAPIConnection::class.java)

    fun translation() =
            try {
                newsAPIConnection.translation("kr", key).execute().body()!!
            } catch (e: Exception) {
                e.printStackTrace()
                println("API 연결 실패")
                null
            }
}