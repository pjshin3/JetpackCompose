package com.example.jetpack_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Text("HONG")
            helloWorldText()
        }
    }

    @Preview
    @Composable
    fun helloWorldText(){
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Hello World")
            Text("Hello World")
            Text("Hello World")
        }
    }
}