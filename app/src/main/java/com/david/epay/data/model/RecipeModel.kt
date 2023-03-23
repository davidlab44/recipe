package com.david.epay.data.model

import com.google.gson.annotations.SerializedName

data class RecipeModel(
    @SerializedName("copyright") val copyright: String,
    @SerializedName("date") val date: String
)
