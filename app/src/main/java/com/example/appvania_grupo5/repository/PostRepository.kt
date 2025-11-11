package com.example.appvania_grupo5.repository

import com.example.appvania_grupo5.data.model.Post
import com.example.appvania_grupo5.data.remote.RetrofitInstance

class PostRepository {

    suspend fun getPosts(): List<Post>{
        return RetrofitInstance.api.getPosts()
    }
}