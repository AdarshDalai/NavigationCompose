package com.itw.navigationcompose.home

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itw.navigationcompose.R

@Composable
fun HomeScreen(
    username: String,
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier.padding(top = 32.dp, start = 8.dp)
            ) {
                IconButton (
                    onClick = {onBackClick()}
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        modifier = Modifier.padding(16.dp)
                    )
                }
                Text(
                    text = "Home",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to the Home Screen: $username!")

            Image(
                painter = painterResource(id = R.drawable.goku),
                contentDescription = "Goku Image",
                modifier = Modifier.clickable(
                    onClick = { onBackClick() }
                )
            )
        }
    }
}
