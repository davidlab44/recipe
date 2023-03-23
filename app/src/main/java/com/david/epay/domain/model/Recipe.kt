package com.david.epay.domain.model

import com.david.epay.data.database.entities.RecipeEntity
import com.david.epay.data.model.RecipeModel

//data class Recipe (val name:String, val description:String, val location:Coordinate)
data class Recipe (val copyright:String, val date:String)

fun RecipeModel.toDomain() = Recipe(copyright, date)
fun RecipeEntity.toDomain() = Recipe(copyright, date)