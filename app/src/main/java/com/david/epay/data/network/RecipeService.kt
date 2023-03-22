package com.david.epay.data.network

import com.david.epay.data.model.RecipeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeService {
    suspend fun getQuotes(): List<RecipeModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllRecipes()
            response.body() ?: emptyList()
        }
    }
}

