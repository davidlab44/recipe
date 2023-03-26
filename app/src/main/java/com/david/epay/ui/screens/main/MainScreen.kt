package com.david.epay.ui.screens.main

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


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