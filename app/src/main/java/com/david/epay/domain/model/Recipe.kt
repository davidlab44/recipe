package com.david.epay.domain.model

import com.david.epay.data.database.entities.RecipeEntity
import com.david.epay.data.model.RecipeModel

data class Recipe (val id:Int, val name:String, val image:String, val description:String, val coordinate:Coordinate)

fun RecipeModel.toDomain() = Recipe(id,name,image,description,coordinate)
fun RecipeEntity.toDomain() = Recipe(id,name,image,description,coordinate)