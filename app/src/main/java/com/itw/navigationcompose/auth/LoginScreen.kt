package com.itw.navigationcompose.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(
    onNavigateToHome: (String) -> Unit
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") }
        )
        Spacer(modifier = Modifier.fillMaxSize(0.02f))
        TextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("Password") }
        )
        Spacer(modifier = Modifier.fillMaxSize(0.04f))
        Button(onClick = { onNavigateToHome(username) }) {
            Text("Login")
        }
    }
}
@Preview(showBackground  = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        onNavigateToHome = {}
    )
}
