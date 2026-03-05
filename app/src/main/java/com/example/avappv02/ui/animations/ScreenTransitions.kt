package com.example.avappv02.ui.animations

import androidx.compose.animation.*
import androidx.compose.animation.core.tween

@ExperimentalAnimationApi
object ScreenTransitions {
    fun enterTransition(durationMillis: Int = 300): EnterTransition {
        return fadeIn(animationSpec = tween(durationMillis)) +
                slideInHorizontally(
                    initialOffsetX = { it },
                    animationSpec = tween(durationMillis)
                )
    }

    fun exitTransition(durationMillis: Int = 300): ExitTransition {
        return fadeOut(animationSpec = tween(durationMillis)) +
                slideOutHorizontally(
                    targetOffsetX = { -it },
                    animationSpec = tween(durationMillis)
                )
    }

    fun popEnterTransition(durationMillis: Int = 300): EnterTransition {
        return fadeIn(animationSpec = tween(durationMillis)) +
                slideInHorizontally(
                    initialOffsetX = { -it },
                    animationSpec = tween(durationMillis)
                )
    }

    fun popExitTransition(durationMillis: Int = 300): ExitTransition {
        return fadeOut(animationSpec = tween(durationMillis)) +
                slideOutHorizontally(
                    targetOffsetX = { it },
                    animationSpec = tween(durationMillis)
                )
    }
}