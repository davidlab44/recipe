package com.david.epay.domain.model

import com.david.epay.data.database.entities.RecipeEntity
import com.david.epay.data.model.RecipeModel

//data class Recipe (val name:String, val description:String, val location:Coordinate)
data class Recipe (val quote:String, val author:String)

fun RecipeModel.toDomain() = Recipe(quote, author)
fun RecipeEntity.toDomain() = Recipe(quote, author)