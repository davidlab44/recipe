package com.david.epay.ui

sealed class Destinations(
    val route: String
) {
    object RecipeListScreen: Destinations("pantalla1")
    object DetailScreen: Destinations("pantalla2/?idRecipe={idRecipe}") {
        fun createRoute(idRecipe: String) = "pantalla2/?idRecipe=$idRecipe"
    }
}
