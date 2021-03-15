package com.toyproject.newsapi.controller

import com.toyproject.newsapi.external.NewsAPIService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NewsAPIController(
        private val waterbellService: NewsAPIService,
) {
    @GetMapping
    fun getNewsApi() = waterbellService.translation()
}