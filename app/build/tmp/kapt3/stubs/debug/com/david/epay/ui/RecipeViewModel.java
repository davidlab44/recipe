package com.david.epay.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/david/epay/ui/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "getRecipesUseCase", "Lcom/david/epay/domain/GetRecipesUseCase;", "(Lcom/david/epay/domain/GetRecipesUseCase;)V", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "recipeModel", "Lcom/david/epay/domain/model/Recipe;", "getRecipeModel", "onCreate", "", "app_debug"})
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    private final com.david.epay.domain.GetRecipesUseCase getRecipesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.david.epay.domain.model.Recipe> recipeModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public RecipeViewModel(@org.jetbrains.annotations.NotNull()
    com.david.epay.domain.GetRecipesUseCase getRecipesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.david.epay.domain.model.Recipe> getRecipeModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void onCreate() {
    }
}