package com.david.epay.data.network

import com.david.epay.data.model.RecipeModel
import retrofit2.Response
import retrofit2.http.GET

interface RecipeApiClient {
    @GET("/.json")
    suspend fun getALlRecipes(): Response<List<RecipeModel>>
}

