package com.example.avappv02.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.avappv02.ui.screens.*
import com.example.avappv02.ui.components.MainScaffold
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.example.avappv02.ui.animations.ScreenTransitions

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    MainScaffold(
        navController = navController
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            AnimatedNavHost(
                navController = navController,
                startDestination = Screen.Splash.route,
                modifier = modifier
            ) {
            composable(
                route = Screen.Splash.route,
                exitTransition = { ScreenTransitions.exitTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                SplashScreen {
                    navController.navigate(Screen.Home.route) {
                        popUpTo(Screen.Splash.route) { inclusive = true }
                    }
                }
            }

            composable(
                route = Screen.Home.route,
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                HomeScreen(
                    onCategoryClick = { catId ->
                        navController.navigate(Screen.SubCategories.createRoute(catId))
                    },
                    onNavigate = { route ->
                        navController.navigate(route) {
                            launchSingleTop = true
                        }
                    }
                )
            }

            composable(
                route = Screen.Offers.route,
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                OffersScreen(
                    onBack = { navController.popBackStack() }
                )
            }

            composable(
                route = Screen.Coupons.route,
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                CouponsScreen(
                    onBack = { navController.popBackStack() }
                )
            }

            composable(
                route = Screen.Search.route,
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                SearchScreen()
            }

            composable(
                route = Screen.Links.route,
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                LinksScreen(
                    onBack = { navController.popBackStack() }
                )
            }

            composable(
                route = Screen.HowTos.route,
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) {
                HowTosScreen(
                    onBack = { navController.popBackStack() }
                )
            }

            composable(
                route = "subcategories/{categoryId}",
                arguments = listOf(navArgument("categoryId") { type = NavType.IntType }),
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) { backStackEntry ->
                val categoryId = backStackEntry.arguments?.getInt("categoryId") ?: -1
                SubCategoriesScreen(
                    categoryId = categoryId,
                    onSubCategoryClick = { subCatId ->
                        navController.navigate("templates/$categoryId/$subCatId")
                    },
                    onBack = { navController.popBackStack() }
                )
            }

            composable(
                route = "templates/{categoryId}/{subCategoryId}",
                arguments = listOf(
                    navArgument("categoryId") { type = NavType.IntType },
                    navArgument("subCategoryId") { type = NavType.IntType }
                ),
                enterTransition = { ScreenTransitions.enterTransition() },
                exitTransition = { ScreenTransitions.exitTransition() },
                popEnterTransition = { ScreenTransitions.popEnterTransition() },
                popExitTransition = { ScreenTransitions.popExitTransition() }
            ) { backStackEntry ->
                val categoryId = backStackEntry.arguments?.getInt("categoryId") ?: -1
                val subCategoryId = backStackEntry.arguments?.getInt("subCategoryId") ?: -1
                TemplatesScreen(
                    catId = categoryId,
                    subCatId = subCategoryId,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}
}
