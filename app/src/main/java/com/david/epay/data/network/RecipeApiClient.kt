package com.david.epay.data.network

import com.david.epay.data.model.RecipeModel
import retrofit2.Response
import retrofit2.http.GET

interface RecipeApiClient {
    @GET("d5bb4884-e0f3-4698-8e41-9ae50eb8cb09")
    suspend fun getAllRecipes(): Response<List<RecipeModel>>
}

