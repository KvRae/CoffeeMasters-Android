package com.kvrae.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kvrae.coffeemasters.ui.theme.CoffeeMastersTheme


@Composable
fun App() {
    Scaffold(
        topBar = {
                 TopAppBar {
                     AppTittle()
                 }
        },
        bottomBar = {

        },
    ) {
        OffersPage()
    }
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