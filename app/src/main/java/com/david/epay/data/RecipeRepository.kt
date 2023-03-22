package com.david.epay.data

import com.david.epay.data.database.dao.RecipeDao
import com.david.epay.data.database.entities.RecipeEntity
import com.david.epay.data.model.RecipeModel
import com.david.epay.data.network.RecipeService
import com.david.epay.domain.model.Recipe
import com.david.epay.domain.model.toDomain
import javax.inject.Inject

class RecipeRepository @Inject constructor(
    private val api: RecipeService,
    private val recipeDao: RecipeDao
) {

    suspend fun getAllRecipesFromApi(): List<Recipe> {
        val response: List<RecipeModel> = api.getRecipes()
        return response.map { it.toDomain() }
    }

    suspend fun getAllRecipesFromDatabase():List<Recipe>{
        val response: List<RecipeEntity> = recipeDao.getAllRecipes()
        val all = response.map { it.toDomain() }
        val all2 = response.map { it.toDomain() }
        return response.map { it.toDomain() }
    }

    suspend fun insertRecipes(recipes:List<RecipeEntity>){
        recipeDao.insertAll(recipes)
    }

    suspend fun clearRecipes(){
        recipeDao.deleteAllRecipes()
    }
}
