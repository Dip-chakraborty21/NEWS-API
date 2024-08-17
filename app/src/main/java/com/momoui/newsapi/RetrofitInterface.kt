package com.momoui.newsapi

import com.momoui.newsapi.models.NewsItem
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitInterface {
    @GET("everything?q=tesla&from=2024-04-18&sortBy=publishedAt&apiKey=5d960ebfe08e4df59c49307ff8116999")
    suspend fun getAllNews(): Response<NewsItem>
}
