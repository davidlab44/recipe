package com.david.epay.domain.model

import com.david.epay.data.RecipeRepository
import com.david.epay.domain.GetRecipesUseCase
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetRecipesUseCaseTest{

    @RelaxedMockK
    private lateinit var recipeRepository: RecipeRepository
    lateinit var getRecipesUseCase: GetRecipesUseCase

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        getRecipesUseCase = GetRecipesUseCase(recipeRepository)
    }

    @Test
    fun `when the api does not return anything then get values from database`()= runBlocking {
        //given
        coEvery { recipeRepository.getAllRecipesFromApi() } returns emptyList()
        //when
        getRecipesUseCase()
        //then
        coEvery (){ recipeRepository.getAllRecipesFromDatabase() }
    }
}