package com.david.epay.domain.model

import com.david.epay.data.database.entities.RecipeEntity
import com.david.epay.data.model.RecipeModel

data class Recipe (val name:String, val image:String, val description:String, val coordinate:Coordinate)
//data class Recipe (val copyright:String="aaa", val date:String="2023")

fun RecipeModel.toDomain() = Recipe(name,image,description,coordinate)
fun RecipeEntity.toDomain() = Recipe(name,image,description,coordinate)