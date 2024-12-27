package com.angelasaez.profileangela.ui.screens.profileAngela

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.angelasaez.profileangela.R
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserCard
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserHobbies
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserMessages
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserPictures
import com.angelasaez.profileangela.model.User

@Composable
fun ProfileAngela(modifier: Modifier) {

    val urlPicture1 = "https://barnimages.com/wp-content/uploads/2024/11/20241127-barnimages-1-960x640.jpg"
    val urlPicture2 = "https://barnimages.com/wp-content/uploads/2024/12/20241205-barnimages-4-960x640.jpg"

    val user by remember {
        mutableStateOf(
            User(
                "Ángela",
                R.drawable.foto_perfil,
                listOf("Leer", "Cine", "Videojuegos", "Música", "Viajar"),
                listOf(urlPicture1, urlPicture2),
                5
            )
        )
    }

    //Scroll vertical aplicación
    val scrollState = rememberScrollState()

    //Columna principal applicación
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFF5EEF8),
                        Color(0xFF9B59B6),
                    )
                )
            )
            .verticalScroll(scrollState)
            .then(modifier),
        verticalArrangement = Arrangement.Top,
    ) {

        UserCard(user)

        UserHobbies(user)

        UserPictures(user)

        UserMessages(user)
    }
}