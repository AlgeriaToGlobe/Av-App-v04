package com.example.avappv02.ui.animations

import androidx.compose.animation.*
import androidx.compose.animation.core.tween

object NavigationAnimations {
    private const val ANIMATION_DURATION = 300

    @ExperimentalAnimationApi
    fun enterTransition() = fadeIn(
        animationSpec = tween(ANIMATION_DURATION)
    ) + slideInHorizontally(
        initialOffsetX = { 1000 },
        animationSpec = tween(ANIMATION_DURATION)
    )

    @ExperimentalAnimationApi
    fun exitTransition() = fadeOut(
        animationSpec = tween(ANIMATION_DURATION)
    ) + slideOutHorizontally(
        targetOffsetX = { -1000 },
        animationSpec = tween(ANIMATION_DURATION)
    )

    @ExperimentalAnimationApi
    fun popEnterTransition() = fadeIn(
        animationSpec = tween(ANIMATION_DURATION)
    ) + slideInHorizontally(
        initialOffsetX = { -1000 },
        animationSpec = tween(ANIMATION_DURATION)
    )

    @ExperimentalAnimationApi
    fun popExitTransition() = fadeOut(
        animationSpec = tween(ANIMATION_DURATION)
    ) + slideOutHorizontally(
        targetOffsetX = { 1000 },
        animationSpec = tween(ANIMATION_DURATION)
    )
}