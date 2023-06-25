package com.kvrae.coffeemasters.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class BottomNavigation(var name: String, var icon: ImageVector, var route:String)

object Routes {
    val MenuPage = BottomNavigation("Menu",Icons.Outlined.Menu,"menu")
    val OffersPage = BottomNavigation("Offers",Icons.Outlined.Menu,"offer")
    val OrdersPage = BottomNavigation("My Order",Icons.Outlined.Menu,"order")
    val InfoPage = BottomNavigation("Info",Icons.Outlined.Menu,"info")
    val Pages = listOf(MenuPage, OffersPage, InfoPage, OrdersPage)
}

@Preview
@Composable
fun NavBarItem_Preview() {
    NavBarItem(page = Routes.InfoPage)
}

@SuppressLint("ModifierParameter")
@Composable
fun NavBarItem(page: BottomNavigation, selected: Boolean = false,  modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 12.dp)) {

        Image(
            imageVector = page.icon,
            contentDescription = page.name,
            colorFilter = ColorFilter.tint(
                if (selected) Alternative1 else Primary
            ),
            modifier = Modifier
                .padding(bottom = 8.dp)
                .size(24.dp)
        )
        Text(page.name,
            fontSize = 12.sp,
            color = if (selected) Alternative1 else Primary
        )
    }
}