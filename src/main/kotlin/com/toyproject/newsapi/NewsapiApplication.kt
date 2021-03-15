package com.toyproject.newsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NewsapiApplication

fun main(args: Array<String>) {
    runApplication<NewsapiApplication>(*args)
}
