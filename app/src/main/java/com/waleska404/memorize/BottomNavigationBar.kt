package com.waleska404.memorize

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomNavigation() {
    val items = listOf(
        BottomNavItem.Decks,
        BottomNavItem.Stats,
        BottomNavItem.Settings
    )

    NavigationBar {
        items.forEach { item ->
            AddItem(
                screen = item
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomNavItem
) {
    NavigationBarItem(
        // Text that shows bellow the icon
        label = {
            Text(text = screen.title)
        },

        // The icon resource
        icon = {
            Icon(
                imageVector =  screen.icon,
                contentDescription = screen.title
            )
        },

        // Display if the icon it is select or not
        selected = true,

        // Always show the label bellow the icon or not
        alwaysShowLabel = true,

        // Click listener for the icon
        onClick = { /*TODO*/ },

        // Control all the colors of the icon
        colors = NavigationBarItemDefaults.colors()
    )
}