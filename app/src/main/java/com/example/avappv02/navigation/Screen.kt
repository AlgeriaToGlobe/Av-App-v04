package com.example.avappv02.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Home : Screen("home")
    object Offers : Screen("offers")
    object Coupons : Screen("coupons")
    object Search : Screen("search")
    object Links : Screen("links")
    object HowTos : Screen("howtos")
    object SubCategories : Screen("subcategories/{categoryId}") {
        fun createRoute(categoryId: Int) = "subcategories/$categoryId"
    }
    object Templates : Screen("templates/{categoryId}/{subCategoryId}") {
        fun createRoute(categoryId: Int, subCategoryId: Int) = "templates/$categoryId/$subCategoryId"
    }

    companion object {
        fun fromRoute(route: String): Screen {
            return when(route) {
                "splash" -> Splash
                "home" -> Home
                "offers" -> Offers
                "coupons" -> Coupons
                "search" -> Search
                "links" -> Links
                "howtos" -> HowTos
                else -> Home
            }
        }
    }
}
