package com.example.appvania_grupo5.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl = "https://jsonplaceholder.typicode.com/")
            .addConverterFactory(factory = GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}