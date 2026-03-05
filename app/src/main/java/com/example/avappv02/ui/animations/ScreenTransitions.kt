package com.example.avappv02.ui.animations

import androidx.compose.animation.*
import androidx.compose.animation.core.tween

@ExperimentalAnimationApi
object ScreenTransitions {
    fun enterTransition(durationMillis: Int = 200): EnterTransition {
        return fadeIn(animationSpec = tween(durationMillis)) +
                slideInHorizontally(
                    initialOffsetX = { it / 4 },
                    animationSpec = tween(durationMillis)
                )
    }

    fun exitTransition(durationMillis: Int = 200): ExitTransition {
        return fadeOut(animationSpec = tween(durationMillis)) +
                slideOutHorizontally(
                    targetOffsetX = { -it / 4 },
                    animationSpec = tween(durationMillis)
                )
    }

    fun popEnterTransition(durationMillis: Int = 200): EnterTransition {
        return fadeIn(animationSpec = tween(durationMillis)) +
                slideInHorizontally(
                    initialOffsetX = { -it / 4 },
                    animationSpec = tween(durationMillis)
                )
    }

    fun popExitTransition(durationMillis: Int = 200): ExitTransition {
        return fadeOut(animationSpec = tween(durationMillis)) +
                slideOutHorizontally(
                    targetOffsetX = { it / 4 },
                    animationSpec = tween(durationMillis)
                )
    }
}