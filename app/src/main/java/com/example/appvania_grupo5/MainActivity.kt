package com.example.appvania_grupo5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appvania_grupo5.ui.screens.PostScreen
import com.example.appvania_grupo5.ui.theme.AppVania_Grupo5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            AppVania_Grupo5Theme {
                val postViewModel: com.example.appvania_grupo5.viewmodel.PostViewModel = viewModel()
                PostScreen(viewModel = postViewModel)
            }
        }

    }
}
