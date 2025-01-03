package com.waleska404.memorize

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.CollectionsBookmark
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    var title: String,
    var icon: ImageVector
) {
    object Decks :
        BottomNavItem(
            "Decks",
            Icons.Filled.CollectionsBookmark
        )

    object Stats :
        BottomNavItem(
            "Stats",
            Icons.Filled.BarChart
        )

    object Settings :
        BottomNavItem(
            "Settings",
            Icons.Filled.Settings
        )
}