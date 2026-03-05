package com.example.avappv02.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import kotlinx.coroutines.delay
import com.example.avappv02.R

@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    var isAnimationPlaying by remember { mutableStateOf(true) }

    // Lottie animation setup
    val composition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(R.raw.logo_animation)
    )

    // Rotating gradient animation
    val infiniteTransition = rememberInfiniteTransition(label = "gradient rotation")
    val gradientAngle by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(5000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "gradient rotation"
    )

    // Pulse animation
    val scale by infiniteTransition.animateFloat(
        initialValue = 0.95f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse"
    )

    // Text fade-in animation
    val textAlpha by animateFloatAsState(
        targetValue = if (isAnimationPlaying) 1f else 0f,
        animationSpec = tween(1000),
        label = "text fade"
    )

    val progress by animateLottieCompositionAsState(
        composition = composition,
        isPlaying = isAnimationPlaying,
        speed = 1f,
        restartOnPlay = false,
        iterations = 1
    )

    LaunchedEffect(progress) {
        if (progress == 1f) {
            delay(500)
            onTimeout()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .systemBarsPadding(),
        contentAlignment = Alignment.Center
    ) {
        // Animated background circles
        Box(
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    rotationZ = gradientAngle
                }
        ) {
            // Decorative circles
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .offset(x = (-50).dp, y = (-50).dp)
                    .scale(scale)
                    .alpha(0.05f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
            )

            Box(
                modifier = Modifier
                    .size(200.dp)
                    .offset(x = 250.dp, y = 100.dp)
                    .scale(scale * 0.9f)
                    .alpha(0.07f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
            )

            Box(
                modifier = Modifier
                    .size(150.dp)
                    .offset(x = 50.dp, y = 500.dp)
                    .scale(scale * 1.1f)
                    .alpha(0.05f)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.secondary)
            )
        }

        // Gradient background
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            MaterialTheme.colorScheme.primary.copy(alpha = 0.05f),
                            Color.Transparent
                        )
                    )
                )
        )

        // Content column
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(32.dp)
        ) {
            // Logo animation with scale
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .scale(scale)
                    .graphicsLayer {
                        shadowElevation = 8f
                        shape = CircleShape
                        clip = true
                    }
                    .background(
                        brush = Brush.radialGradient(
                            colors = listOf(
                                MaterialTheme.colorScheme.surface,
                                MaterialTheme.colorScheme.surface.copy(alpha = 0.9f)
                            ),
                            center = Offset(100f, 100f),
                            radius = 100f
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                LottieAnimation(
                    composition = composition,
                    progress = { progress },
                    modifier = Modifier.size(160.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // App name with fade animation
            Text(
                text = "Ascend Viral",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold
                ),
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.alpha(textAlpha)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Updated subtitle with fade animation
            Text(
                text = "Support Team Template Hub",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                modifier = Modifier.alpha(textAlpha),
                textAlign = TextAlign.Center
            )
        }
    }
}