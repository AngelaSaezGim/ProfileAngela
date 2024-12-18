package com.angelasaez.profileangela.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.angelasaez.profileangela.ui.theme.ProfileAngelaTheme

@Composable
fun ProfileAngelaContent(content: @Composable (modifier: Modifier) -> Unit) {

    ProfileAngelaTheme {

        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            content(Modifier.padding(innerPadding))

        }
    }
}