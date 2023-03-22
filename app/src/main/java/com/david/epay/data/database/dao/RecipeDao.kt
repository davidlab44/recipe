package com.david.epay.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.david.epay.data.database.entities.RecipeEntity

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipe_table ORDER BY author DESC")
    suspend fun getAllRecipes():List<RecipeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(recipes:List<RecipeEntity>)

    @Query("DELETE FROM recipe_table")
    suspend fun deleteAllRecipes()
}