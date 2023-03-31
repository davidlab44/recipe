package com.david.epay.domain

import com.david.epay.data.RecipeRepository
import com.david.epay.data.database.entities.toDatabase
import com.david.epay.domain.model.Recipe
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(private val repository: RecipeRepository) {
    suspend operator fun invoke():List<Recipe>{
        val recipes = repository.getAllRecipesFromApi()
        return if(recipes.isNotEmpty()){
            repository.clearRecipes()
            repository.insertRecipes(recipes.map { it.toDatabase() })
            recipes
        }else{
            repository.getAllRecipesFromDatabase()
        }
    }
}
