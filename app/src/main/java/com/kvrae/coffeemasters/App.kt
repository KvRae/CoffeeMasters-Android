package com.kvrae.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kvrae.coffeemasters.pages.InfoPage
import com.kvrae.coffeemasters.pages.MenuPage
import com.kvrae.coffeemasters.pages.OffersPage
import com.kvrae.coffeemasters.pages.OrdersPage
import com.kvrae.coffeemasters.ui.theme.CoffeeMastersTheme
import com.kvrae.coffeemasters.ui.theme.NavBar
import com.kvrae.coffeemasters.ui.theme.Routes


@Composable
fun App() {
    val selectedRoute = remember {
        mutableStateOf(Routes.MenuPage.route)
    }
    Scaffold(
        topBar = {
                 TopAppBar {
                     AppTittle()
                 }
        },
        content = {
                  when(selectedRoute.value){
                      Routes.MenuPage.route -> MenuPage()
                      Routes.InfoPage.route -> InfoPage()
                      Routes.OrdersPage.route -> OrdersPage()
                      Routes.OffersPage.route -> OffersPage()
                  }
        },
        bottomBar = {
            NavBar(selectedRoute = selectedRoute.value,
                onChange = {
                newRoute -> selectedRoute.value = newRoute
            })
        },
    )
}

@Composable
fun AppTittle() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "CoffeeMasters Logo" )

    }
}

@Preview
@Composable
fun AppPreview() {
    CoffeeMastersTheme {
        App()

    }
}