package com.david.epay.data.model

import com.google.gson.annotations.SerializedName

data class RecipeModel(
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)
