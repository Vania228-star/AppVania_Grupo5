package com.example.appvania_grupo5.data.remote

import com.example.appvania_grupo5.data.model.Post
import retrofit2.http.GET

interface ApiService{
    @GET(value = "/posts")
    suspend fun getPosts(): List<Post>
}