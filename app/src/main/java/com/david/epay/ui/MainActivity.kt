package com.david.epay.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.david.epay.ui.RecipeViewModel
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : ComponentActivity() {
    private val quoteViewModel: RecipeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lista = quoteViewModel.onCreate()
        val lista2 = quoteViewModel.onCreate()
        val rr = quoteViewModel.onCreate()

        /*
        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })
        quoteViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }

         */
        setContent {
            NavigationHost()
        }
    }
}










