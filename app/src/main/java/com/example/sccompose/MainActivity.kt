package com.example.sccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sccompose.ui.navigation.Navigation
import com.example.sccompose.ui.theme.SCComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SCComposeTheme {
                Navigation()
            }
        }
    }
}