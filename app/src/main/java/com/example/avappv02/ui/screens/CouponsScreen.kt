package com.example.avappv02.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import android.os.Build
import com.example.avappv02.data.Coupon
import com.example.avappv02.data.MockData
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CouponsScreen(
    modifier: Modifier = Modifier
) {
    val coupons = MockData.coupons
    // Android 13+ shows its own clipboard notification, so suppress ours to avoid overlap
    val showCustomCopiedNotification = Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
    var showCopiedMessage by remember { mutableStateOf(false) }
    var copiedCouponCode by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf<CouponCategory?>(null) }
    val scope = rememberCoroutineScope()

    // Group coupons by their category
    val groupedCoupons = remember(coupons) {
        coupons.groupBy { coupon ->
            when {
                coupon.code.contains("ESHAVIP") || coupon.code.contains("JAYVIP") ->
                    CouponCategory.GROWTH_ASSISTANT

                coupon.code.contains("VIP20") ->
                    CouponCategory.SUPPORT_TEAM

                coupon.code.equals("GROW2025", ignoreCase = true) ||
                        coupon.code.equals("COURSE10", ignoreCase = true) ||
                        coupon.code.equals("GOVIRAL", ignoreCase = true) ->
                    CouponCategory.YOUTUBE

                coupon.code.contains("AGENCY") ->
                    CouponCategory.AGENCY

                else ->
                    CouponCategory.STANDARD
            }
        }
    }

    val filteredCoupons = when (selectedFilter) {
        null -> coupons
        else -> groupedCoupons[selectedFilter] ?: emptyList()
    }

    // Auto-dismiss notification after 3 seconds
    LaunchedEffect(showCopiedMessage) {
        if (showCopiedMessage) {
            delay(3000)
            showCopiedMessage = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Available Coupons",
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { padding ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                // Filter section
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(
                        text = "Filter by category",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    ScrollableFilterChips(
                        selectedCategory = selectedFilter,
                        onCategorySelected = { selectedFilter = it }
                    )
                }

                // Coupons list
                LazyColumn(
                    contentPadding = PaddingValues(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 96.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(filteredCoupons) { coupon ->
                        val category = groupedCoupons.entries.find { it.value.contains(coupon) }?.key
                            ?: CouponCategory.STANDARD
                        CouponCard(
                            coupon = coupon,
                            category = category,
                            onCopyClicked = {
                                if (showCustomCopiedNotification) {
                                    copiedCouponCode = coupon.code
                                    if (showCopiedMessage) {
                                        showCopiedMessage = false
                                        scope.launch {
                                            delay(100)
                                            showCopiedMessage = true
                                        }
                                    } else {
                                        showCopiedMessage = true
                                    }
                                }
                            }
                        )
                    }
                }
            }

            // Copied notification
            AnimatedVisibility(
                visible = showCopiedMessage,
                enter = fadeIn() + slideInVertically(initialOffsetY = { it }),
                exit = fadeOut() + slideOutVertically(targetOffsetY = { it }),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .navigationBarsPadding()
                    .padding(bottom = 96.dp, start = 16.dp, end = 16.dp)
            ) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    shadowElevation = 4.dp
                ) {
                    Row(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Text(
                                text = "Code copied: $copiedCouponCode",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        TextButton(onClick = { showCopiedMessage = false }) {
                            Text("Dismiss", color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ScrollableFilterChips(
    selectedCategory: CouponCategory?,
    onCategorySelected: (CouponCategory?) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(bottom = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // "All" chip
        FilterChip(
            selected = selectedCategory == null,
            onClick = { onCategorySelected(null) },
            label = {
                Text(
                    text = "All",
                    style = MaterialTheme.typography.bodySmall
                )
            },
            shape = RoundedCornerShape(20.dp),
            colors = FilterChipDefaults.filterChipColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                selectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                labelColor = MaterialTheme.colorScheme.onSurfaceVariant,
                selectedLabelColor = MaterialTheme.colorScheme.onPrimaryContainer
            ),
            border = null
        )

        for (category in CouponCategory.values()) {
            FilterChip(
                selected = selectedCategory == category,
                onClick = {
                    onCategorySelected(if (selectedCategory == category) null else category)
                },
                label = {
                    Text(
                        text = category.displayName,
                        style = MaterialTheme.typography.bodySmall
                    )
                },
                shape = RoundedCornerShape(20.dp),
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    selectedContainerColor = MaterialTheme.colorScheme.primaryContainer,
                    labelColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    selectedLabelColor = MaterialTheme.colorScheme.onPrimaryContainer
                ),
                border = null
            )
        }
    }
}

@Composable
fun CouponCard(
    coupon: Coupon,
    category: CouponCategory,
    onCopyClicked: () -> Unit
) {
    val clipboardManager = LocalClipboardManager.current

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        // Category indicator
        Surface(
            modifier = Modifier
                .wrapContentWidth()
                .padding(bottom = 8.dp),
            shape = RoundedCornerShape(4.dp),
            color = getCategoryColor(category).copy(alpha = 0.2f)
        ) {
            Text(
                text = category.displayName,
                style = MaterialTheme.typography.labelSmall,
                color = getCategoryColor(category),
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }

        // Main card
        ElevatedCard(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Title - always visible now
                Text(
                    text = coupon.title,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )

                // Coupon code box with gradient background
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = getCategoryGradient(category)
                            )
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "Code",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White.copy(alpha = 0.7f)
                            )
                            Text(
                                text = coupon.code,
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold
                                ),
                                color = Color.White
                            )
                        }

                        // Copy button
                        Button(
                            onClick = {
                                clipboardManager.setText(AnnotatedString(coupon.code))
                                onCopyClicked()
                            },
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White.copy(alpha = 0.2f),
                                contentColor = Color.White
                            ),
                            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                        ) {
                            Icon(
                                Icons.Outlined.ContentCopy,
                                contentDescription = "Copy code",
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text("Copy")
                        }
                    }
                }

                // Details - always visible now
                Text(
                    text = coupon.details,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
fun getCategoryColor(category: CouponCategory): Color {
    return when (category) {
        CouponCategory.GROWTH_ASSISTANT -> Color(0xFF673AB7)  // Purple
        CouponCategory.SUPPORT_TEAM -> Color(0xFFE91E63)      // Pink
        CouponCategory.YOUTUBE -> Color(0xFFFF5722)           // Deep Orange
        CouponCategory.AGENCY -> Color(0xFF1976D2)            // Blue
        CouponCategory.STANDARD -> Color(0xFF303F9F)          // Indigo
    }
}

@Composable
fun getCategoryGradient(category: CouponCategory): List<Color> {
    return when (category) {
        CouponCategory.GROWTH_ASSISTANT -> listOf(Color(0xFF673AB7), Color(0xFF9575CD)) // Purple
        CouponCategory.SUPPORT_TEAM -> listOf(Color(0xFFE91E63), Color(0xFFF06292))     // Pink
        CouponCategory.YOUTUBE -> listOf(Color(0xFFFF5722), Color(0xFFFF8A65))          // Orange
        CouponCategory.AGENCY -> listOf(Color(0xFF1976D2), Color(0xFF64B5F6))           // Blue
        CouponCategory.STANDARD -> listOf(Color(0xFF303F9F), Color(0xFF7986CB))         // Indigo
    }
}

enum class CouponCategory(val displayName: String) {
    GROWTH_ASSISTANT("Growth Assistant"),
    SUPPORT_TEAM("Support Team"),
    YOUTUBE("YouTube"),
    AGENCY("Agency"),
    STANDARD("Standard")
}