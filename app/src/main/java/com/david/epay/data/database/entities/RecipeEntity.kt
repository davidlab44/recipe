package com.david.epay.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.david.epay.domain.model.Recipe


@Entity(tableName = "recipe_table")
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "copyright") val copyright: String,
    @ColumnInfo(name = "date") val date: String
)


fun Recipe.toDatabase() = RecipeEntity(copyright = copyright, date =  date)