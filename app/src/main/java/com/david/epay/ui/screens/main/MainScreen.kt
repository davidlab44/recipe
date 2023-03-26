package com.david.epay.ui.screens.main

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@ExperimentalFoundationApi
@Composable
fun MainScreen(context:Context) {
    Column{
        Text(text = "Hello Epay!")
        OutlinedButton(onClick = {
            Toast.makeText(context, "Clicked on Out Lined Button", Toast.LENGTH_SHORT).show()
        }) {
            Text("Outlined Button")
        }
    }
}