package com.example.avappv02.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.rounded.OpenInNew
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.example.avappv02.data.MockData
import com.example.avappv02.data.Template

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LinksScreen(
    onBack: () -> Unit
) {
    val links = remember {
        MockData.allCategories
            .flatMap { it.subCategories }
            .find { it.name == "Links" }
            ?.templates ?: emptyList()
    }
    val clipboardManager = LocalClipboardManager.current
    val uriHandler = LocalUriHandler.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Quick Links") },
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp, 8.dp, 16.dp, 100.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(links) { link ->
                LinkCard(
                    link = link,
                    onCopy = {
                        val url = link.content.lines().lastOrNull { it.startsWith("http") } ?: link.content
                        clipboardManager.setText(AnnotatedString(url.trim()))
                    },
                    onOpen = {
                        val url = link.content.lines().lastOrNull { it.startsWith("http") } ?: link.content
                        try {
                            uriHandler.openUri(url.trim())
                        } catch (_: Exception) { }
                    }
                )
            }
        }
    }
}

@Composable
private fun LinkCard(
    link: Template,
    onCopy: () -> Unit,
    onOpen: () -> Unit
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Surface(
                    modifier = Modifier.size(40.dp),
                    shape = RoundedCornerShape(10.dp),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            Icons.Default.Link,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = link.title,
                        style = MaterialTheme.typography.titleMedium
                    )
                    val url = link.content.lines().lastOrNull { it.startsWith("http") } ?: ""
                    if (url.isNotEmpty()) {
                        Text(
                            text = url.trim(),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.7f),
                            maxLines = 1
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = onCopy,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Icon(
                        Icons.Default.ContentCopy,
                        contentDescription = "Copy link",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text("Copy")
                }

                Spacer(Modifier.width(8.dp))

                Button(
                    onClick = onOpen,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Icon(
                        Icons.Rounded.OpenInNew,
                        contentDescription = "Open link",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(Modifier.width(4.dp))
                    Text("Open")
                }
            }
        }
    }
}
