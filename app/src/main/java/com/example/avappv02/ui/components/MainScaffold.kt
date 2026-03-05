package com.example.avappv02.ui.components

import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.avappv02.navigation.Screen

@Composable
fun MainScaffold(
    navController: NavHostController,
    content: @Composable () -> Unit
) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    val shouldShowBottomBar = currentRoute != Screen.Splash.route

    Box(modifier = Modifier.fillMaxSize()) {
        // Content fills the entire screen
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }

        // Bottom bar overlays at the bottom
        AnimatedVisibility(
            visible = shouldShowBottomBar,
            enter = slideInVertically(initialOffsetY = { it }) + fadeIn(),
            exit = slideOutVertically(targetOffsetY = { it }) + fadeOut(),
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.background,
                tonalElevation = 2.dp
            ) {
                AppBottomNavigation(
                    navController = navController,
                    modifier = Modifier
                        .fillMaxWidth()
                        .navigationBarsPadding()
                )
            }
        }
    }
}
