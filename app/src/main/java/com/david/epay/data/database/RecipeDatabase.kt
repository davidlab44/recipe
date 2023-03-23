package com.david.epay.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.david.epay.data.database.dao.RecipeDao
import com.david.epay.data.database.entities.RecipeEntity

@Database(entities = [RecipeEntity::class], version = 2)
abstract class RecipeDatabase: RoomDatabase() {

    abstract fun getRecipeDao(): RecipeDao
}
