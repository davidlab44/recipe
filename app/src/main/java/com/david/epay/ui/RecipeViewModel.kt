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
class RecipeViewModel @Inject constructor(private val getRecipesUseCase: GetRecipesUseCase) : ViewModel() {

    val recipeModel = MutableLiveData<Recipe>()
    val isLoading = MutableLiveData<Boolean>()
    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getRecipesUseCase()
            if (!result.isNullOrEmpty()) {
                recipeModel.postValue(result[0])
                isLoading.postValue(false)
            }else{
                val ve = "aqui"
                val alla = "alla"
            }
        }
    }
}