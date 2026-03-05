package com.example.avappv02

import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.example.avappv02.navigation.AppNavHost
import com.example.avappv02.ui.theme.AVAPPV02Theme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This is the key change - tell the system to draw behind system bars
        WindowCompat.setDecorFitsSystemWindows(window, false)
        if (resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_NO) {
window.navigationBarColor = android.graphics.Color.WHITE
} else {
window.navigationBarColor = android.graphics.Color.parseColor("#121212")
}

        // Request the highest available refresh rate (120Hz on supported devices)
        enableHighRefreshRate()
        setContent {
            AVAPPV02Theme {
                AppContent()
            }
        }
    }

    private fun enableHighRefreshRate() {
        val display = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            display
        } else {
            @Suppress("DEPRECATION")
            windowManager.defaultDisplay
        }
        display?.supportedModes?.let { modes ->
            val highestRefreshRateMode = modes.maxByOrNull { it.refreshRate }
            highestRefreshRateMode?.let { mode ->
                val params = window.attributes
                params.preferredDisplayModeId = mode.modeId
                window.attributes = params
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun AppContent() {
    val systemUiController = rememberSystemUiController()
    val navController = rememberAnimatedNavController()
    val isDarkTheme = isSystemInDarkTheme()

    SideEffect {
        // Make the system bars transparent
        systemUiController.setSystemBarsColor(
            color = Color.Transparent,
            darkIcons = !isDarkTheme
        )
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        AppNavHost(navController = navController)
    }
}