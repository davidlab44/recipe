package com.david.epay.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.david.epay.data.database.entities.RecipeEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/david/epay/data/database/RecipeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getRecipeDao", "Lcom/david/epay/data/database/dao/RecipeDao;", "app_debug"})
public abstract class RecipeDatabase extends androidx.room.RoomDatabase {
    
    public RecipeDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.david.epay.data.database.dao.RecipeDao getRecipeDao();
}