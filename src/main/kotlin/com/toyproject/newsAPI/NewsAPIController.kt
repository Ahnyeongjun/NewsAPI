package com.toyproject.newsAPI

import com.toyproject.newsAPI.external.NewsAPIService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NewsAPIController(
        private val waterbellService: NewsAPIService,
) {
    @GetMapping
    fun a() = waterbellService.translation()
}