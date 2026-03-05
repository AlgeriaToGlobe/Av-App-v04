package com.example.avappv02.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val title: String, val icon: ImageVector) {
    object Home : BottomNavItem(Screen.Home.route, "Home", Icons.Filled.Home)
    object Offers : BottomNavItem(Screen.Offers.route, "Offers", Icons.Filled.LocalOffer)
    object Coupons : BottomNavItem(Screen.Coupons.route, "Coupons", Icons.Filled.CardGiftcard)
    object Search : BottomNavItem(Screen.Search.route, "Search", Icons.Filled.Search)
}
