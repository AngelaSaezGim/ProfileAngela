package com.angelasaez.profileangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.angelasaez.profileangela.ui.ProfileAngelaContent
import com.angelasaez.profileangela.ui.screens.ProfileAngela
import com.angelasaez.profileangela.ui.theme.ProfileAngelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            ProfileAngelaContent { modifier ->
                ProfileAngela(modifier)
            }
        }
    }
}