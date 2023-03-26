package com.david.epay.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u0082\u0001\u0002\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/david/epay/ui/navigation/NavItem;", "", "baseRoute", "", "navArgs", "", "Lcom/david/epay/ui/navigation/NavArgs;", "(Ljava/lang/String;Ljava/util/List;)V", "args", "Landroidx/navigation/NamedNavArgument;", "getArgs", "()Ljava/util/List;", "getBaseRoute$app_debug", "()Ljava/lang/String;", "route", "getRoute", "DetailNavItem", "MainNavItem", "Lcom/david/epay/ui/navigation/NavItem$DetailNavItem;", "Lcom/david/epay/ui/navigation/NavItem$MainNavItem;", "app_debug"})
public abstract class NavItem {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseRoute = null;
    private final java.util.List<com.david.epay.ui.navigation.NavArgs> navArgs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<androidx.navigation.NamedNavArgument> args = null;
    
    private NavItem(java.lang.String baseRoute, java.util.List<? extends com.david.epay.ui.navigation.NavArgs> navArgs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseRoute$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<androidx.navigation.NamedNavArgument> getArgs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/david/epay/ui/navigation/NavItem$MainNavItem;", "Lcom/david/epay/ui/navigation/NavItem;", "()V", "app_debug"})
    public static final class MainNavItem extends com.david.epay.ui.navigation.NavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.david.epay.ui.navigation.NavItem.MainNavItem INSTANCE = null;
        
        private MainNavItem() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/david/epay/ui/navigation/NavItem$DetailNavItem;", "Lcom/david/epay/ui/navigation/NavItem;", "()V", "createRoute", "", "mediaId", "", "app_debug"})
    public static final class DetailNavItem extends com.david.epay.ui.navigation.NavItem {
        @org.jetbrains.annotations.NotNull()
        public static final com.david.epay.ui.navigation.NavItem.DetailNavItem INSTANCE = null;
        
        private DetailNavItem() {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(int mediaId) {
            return null;
        }
    }
}