package com.david.epay.data.network

import com.david.epay.data.model.RecipeModel
import retrofit2.Response
import retrofit2.http.GET

interface RecipeApiClient {
    @GET("apod?start_date=2023-03-15&api_key=DEMO_KEY")
    suspend fun getAllRecipes(): Response<List<RecipeModel>>
}

