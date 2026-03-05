package com.example.avappv02.ui.screens

import androidx.compose.animation.*
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
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import android.os.Build
import com.example.avappv02.data.Template
import com.example.avappv02.data.MockData

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TemplatesScreen(
    catId: Int,
    subCatId: Int,
    onBack: () -> Unit
) {
    val category = MockData.allCategories.find { it.id == catId }
    val subCategory = category?.subCategories?.find { it.id == subCatId }
    val templates = subCategory?.templates ?: emptyList()
    val showCustomCopiedNotification = Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU
    var showSnackbar by remember { mutableStateOf(false) }
    var copiedTemplateName by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            subCategory?.name ?: "Templates",
                            style = MaterialTheme.typography.titleLarge
                        )
                        if (category != null) {
                            Text(
                                category.name,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = 16.dp,
                    bottom = 100.dp  // Increased bottom padding to avoid nav bar overlap
                ),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(templates) { template ->
                    TemplateCard(
                        template = template,
                        onCopied = {
                            if (showCustomCopiedNotification) {
                                copiedTemplateName = template.title
                                showSnackbar = true
                            }
                        }
                    )
                }
            }

            // Notification positioned above bottom navigation
            AnimatedVisibility(
                visible = showSnackbar,
                enter = fadeIn() + slideInVertically(initialOffsetY = { it }),
                exit = fadeOut() + slideOutVertically(targetOffsetY = { it }),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 96.dp, start = 16.dp, end = 16.dp)
            ) {
                Surface(
                    color = MaterialTheme.colorScheme.surface,
                    shape = RoundedCornerShape(12.dp),
                    tonalElevation = 2.dp,
                    shadowElevation = 4.dp
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Default.Check,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Text("Template copied to clipboard")
                        }

                        TextButton(onClick = { showSnackbar = false }) {
                            Text("Dismiss")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TemplateCard(
    template: Template,
    onCopied: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val clipboardManager = LocalClipboardManager.current

    // Always show the expand button for any template with more than 3 lines
    val needsExpand = template.content.count { it == '\n' } > 3

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Header row with icon and title
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Icon
                Surface(
                    modifier = Modifier.size(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            Icons.Default.Description,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(12.dp))

                // Title
                Text(
                    text = template.title,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Content area
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    // Template content with expansion
                    Text(
                        text = template.content,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = if (expanded) Int.MAX_VALUE else 4,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            // Always show the expand button if there's more content
            if (needsExpand || template.content.length > 150) {  // Threshold for showing expand button
                TextButton(
                    onClick = { expanded = !expanded },
                    modifier = Modifier.align(Alignment.Start),
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(if (expanded) "Show Less" else "Show More")
                    Icon(
                        if (expanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = if (expanded) "Show less" else "Show more",
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            // Copy button
            Button(
                onClick = {
                    clipboardManager.setText(AnnotatedString(template.content))
                    onCopied()
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(
                    Icons.Default.ContentCopy,
                    contentDescription = "Copy",
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Copy")
            }
        }
    }
}