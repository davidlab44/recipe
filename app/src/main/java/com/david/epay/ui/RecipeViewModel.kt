package com.david.epay.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
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

    //val recipeModel = MutableLiveData<Recipe>()
    val recipeModel = MutableLiveData<List<Recipe>>()

    val isLoading = MutableLiveData<Boolean>()
    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getRecipesUseCase()
            if (!result.isNullOrEmpty()) {
                recipeModel.postValue(result)
                isLoading.postValue(false)
            }else{
                val y = true
            }
        }
    }

}