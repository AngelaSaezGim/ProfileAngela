package com.angelasaez.profileangela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.angelasaez.profileangela.ui.ProfileAngelaContent
import com.angelasaez.profileangela.ui.screens.profileAngela.ProfileAngela

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