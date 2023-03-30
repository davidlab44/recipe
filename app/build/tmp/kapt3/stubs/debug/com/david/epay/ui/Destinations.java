package com.david.epay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/david/epay/ui/Destinations;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "DetailScreen", "RecipeListScreen", "Lcom/david/epay/ui/Destinations$DetailScreen;", "Lcom/david/epay/ui/Destinations$RecipeListScreen;", "app_debug"})
public abstract class Destinations {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Destinations(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/david/epay/ui/Destinations$RecipeListScreen;", "Lcom/david/epay/ui/Destinations;", "()V", "app_debug"})
    public static final class RecipeListScreen extends com.david.epay.ui.Destinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.david.epay.ui.Destinations.RecipeListScreen INSTANCE = null;
        
        private RecipeListScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/david/epay/ui/Destinations$DetailScreen;", "Lcom/david/epay/ui/Destinations;", "()V", "createRoute", "", "idRecipe", "app_debug"})
    public static final class DetailScreen extends com.david.epay.ui.Destinations {
        @org.jetbrains.annotations.NotNull()
        public static final com.david.epay.ui.Destinations.DetailScreen INSTANCE = null;
        
        private DetailScreen() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.NotNull()
        java.lang.String idRecipe) {
            return null;
        }
    }
}