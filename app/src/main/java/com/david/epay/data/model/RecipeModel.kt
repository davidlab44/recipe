package com.david.epay.data.model

import com.david.epay.domain.model.Coordinate
import com.google.gson.annotations.SerializedName

data class RecipeModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("image") val image: String,
    @SerializedName("description") val description: String,
    @SerializedName("coordinate") val coordinate: Coordinate
)
