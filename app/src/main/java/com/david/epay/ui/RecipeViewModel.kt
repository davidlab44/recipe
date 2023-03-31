package com.david.epay.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.david.epay.domain.GetRecipesUseCase
import com.david.epay.domain.model.Recipe
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase) : ViewModel() {

    var recipeModel = listOf<Recipe>()

    val isLoading = MutableLiveData<Boolean>()
    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getRecipesUseCase()
            if (!result.isNullOrEmpty()) {
                recipeModel =result
                isLoading.postValue(false)
            }else{
                val y = true
            }
        }
    }

}