package com.example.avappv02.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.avappv02.data.Category
import com.example.avappv02.data.MockData

data class MenuSection(
    val title: String,
    val description: String,
    val icon: ImageVector,
    val route: String,
    val gradientColors: List<Color>
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onCategoryClick: (Int) -> Unit,
    onNavigate: (String) -> Unit = {}
) {
    val categories = MockData.allCategories

    val menuSections = remember {
        listOf(
            MenuSection(
                title = "Knowledge Base",
                description = "Browse all support categories and templates",
                icon = Icons.Default.MenuBook,
                route = "knowledge_base",
                gradientColors = listOf(Color(0xFF6C5CE7), Color(0xFF818CF8))
            ),
            MenuSection(
                title = "Coupons",
                description = "View available discount codes",
                icon = Icons.Default.CardGiftcard,
                route = "coupons",
                gradientColors = listOf(Color(0xFFE84393), Color(0xFFF06292))
            ),
            MenuSection(
                title = "Quick Links",
                description = "Access important links quickly",
                icon = Icons.Default.Link,
                route = "links",
                gradientColors = listOf(Color(0xFF00CEC9), Color(0xFF55EFC4))
            ),
            MenuSection(
                title = "How To's",
                description = "Step-by-step guides for common tasks",
                icon = Icons.Default.HelpOutline,
                route = "howtos",
                gradientColors = listOf(Color(0xFFFF5722), Color(0xFFFF8A65))
            ),
            MenuSection(
                title = "Plans & Offers",
                description = "View available growth plans",
                icon = Icons.Default.LocalOffer,
                route = "offers",
                gradientColors = listOf(Color(0xFF1976D2), Color(0xFF64B5F6))
            )
        )
    }

    var showKnowledgeBase by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = if (showKnowledgeBase) "Knowledge Base" else "Support Menu",
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                navigationIcon = {
                    if (showKnowledgeBase) {
                        IconButton(onClick = { showKnowledgeBase = false }) {
                            Icon(Icons.Default.ArrowBack, "Back to menu")
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { padding ->
        if (showKnowledgeBase) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 96.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(categories) { category ->
                    CategoryCard(
                        category = category,
                        onClick = onCategoryClick
                    )
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 96.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(menuSections) { section ->
                    MenuSectionCard(
                        section = section,
                        onClick = {
                            if (section.route == "knowledge_base") {
                                showKnowledgeBase = true
                            } else {
                                onNavigate(section.route)
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MenuSectionCard(
    section: MenuSection,
    onClick: () -> Unit
) {
    ElevatedCard(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 2.dp,
            pressedElevation = 4.dp
        ),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            brush = Brush.linearGradient(
                                colors = section.gradientColors
                            )
                        )
                ) {
                    Icon(
                        imageVector = section.icon,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }

                Column {
                    Text(
                        text = section.title,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = section.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Surface(
                modifier = Modifier.size(36.dp),
                shape = RoundedCornerShape(12.dp),
                color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f)
            ) {
                Icon(
                    Icons.Default.ChevronRight,
                    contentDescription = "Open",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun CategoryCard(
    category: Category,
    onClick: (Int) -> Unit
) {
    ElevatedCard(
        onClick = { onClick(category.id) },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 2.dp,
            pressedElevation = 4.dp
        ),
        colors = CardDefaults.elevatedCardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    MaterialTheme.colorScheme.primary,
                                    MaterialTheme.colorScheme.primary.copy(alpha = 0.7f)
                                )
                            )
                        )
                ) {
                    Icon(
                        imageVector = categoryIcon(category.id),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = Color.White
                    )
                }

                Column {
                    Text(
                        text = category.name,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "${category.subCategories.size} subcategories",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Surface(
                modifier = Modifier.size(36.dp),
                shape = RoundedCornerShape(12.dp),
                color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f)
            ) {
                Icon(
                    Icons.Default.ChevronRight,
                    contentDescription = "View category",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
private fun categoryIcon(id: Int): ImageVector = when (id) {
    1 -> Icons.Default.ManageAccounts
    2 -> Icons.Default.ContentPaste
    3 -> Icons.Default.Brush
    4 -> Icons.Default.SupportAgent
    5 -> Icons.Default.Security
    6 -> Icons.Default.SmartToy
    7 -> Icons.Default.Build
    8 -> Icons.Default.Business
    9 -> Icons.Default.Star
    else -> Icons.Default.Folder
}
