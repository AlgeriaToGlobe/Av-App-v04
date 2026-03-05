package com.example.avappv02.ui.animations

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp

@Composable
fun BottomBarAnimation(
    isSelected: Boolean,
    modifier: Modifier = Modifier
) {
    val scale by animateFloatAsState(
        targetValue = if (isSelected) 1f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "scale"
    )

    Box(
        modifier = modifier
            .scale(scale)
            .size(40.dp)
            .clip(CircleShape)
            .background(
                MaterialTheme.colorScheme.primaryContainer.copy(
                    alpha = if (isSelected) 0.3f else 0f
                )
            )
    )
}

@Composable
fun BottomBarIndicator(
    isSelected: Boolean,
    modifier: Modifier = Modifier
) {
    val width by animateFloatAsState(
        targetValue = if (isSelected) 1f else 0f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        ),
        label = "width"
    )

    Box(
        modifier = modifier
            .padding(bottom = 2.dp)
            .width((48 * width).dp)
            .height(2.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
    )
}