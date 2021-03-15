package com.toyproject.waterbell.external


import com.fasterxml.jackson.annotation.JsonProperty

class NewsAPIResponse (
        @JsonProperty("status")
        val status:String?,
        @JsonProperty("totalResults")
        val totalResults:Long?,
        @JsonProperty("articles")
        val articles:List<Articles?>

){
        class Articles(
                @JsonProperty("source")
                val source:Source2?,
                @JsonProperty("author")
                val author:String?,
                @JsonProperty("title")
                val title:String?,
                @JsonProperty("description")
                val description:String?,
                @JsonProperty("url")
                val url:String?,
                @JsonProperty("urlToImage")
                val urlToImage:String?,
                @JsonProperty("publishedAt")
                val publishedAt:String?,
                @JsonProperty("content")
                val content:String?,
        )
        class Source2(
                @JsonProperty("id")
                val id:String?,
                @JsonProperty("name")
                val name:String?,
        )
}