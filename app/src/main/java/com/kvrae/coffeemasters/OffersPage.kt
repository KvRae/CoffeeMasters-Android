package com.kvrae.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kvrae.coffeemasters.ui.theme.Alternative2


@Composable
fun Offer(title: String , description: String) {
    Box(modifier = Modifier.padding(16.dp)){
        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription ="Background pattern",
            modifier = Modifier.fillMaxWidth()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Text(text = title,
                style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = description,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)

            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun OffersPage(
) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Offer(title = "hello", description = "world")
        Offer(title = "hello1", description = "world1")
        Offer(title = "hello1", description = "world1")

    }
}