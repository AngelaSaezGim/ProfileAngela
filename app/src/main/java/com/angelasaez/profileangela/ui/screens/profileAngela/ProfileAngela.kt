package com.angelasaez.profileangela.ui.screens.profileAngela

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.angelasaez.profileangela.R
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserCard
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserHobbies
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserMessages
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserPictures
import com.angelasaez.profileangela.model.User
import com.angelasaez.profileangela.ui.screens.common.ProfileFooter

@Composable
fun ProfileAngela(modifier: Modifier) {

    val user by remember {
        mutableStateOf(
            User(
                "Ángela",
                R.drawable.foto_perfil,
                listOf("Leer", "Cine", "Videojuegos", "Música", "Viajar"),
                listOf(R.drawable.foto1, R.drawable.foto2),
                5
            )
        )
    }


    //Columna principal applicación
    Column(
        modifier = Modifier
            .fillMaxSize()
            .then(modifier),
        verticalArrangement = Arrangement.Top,
    ) {

        UserCard(user)

        UserHobbies(user)

        UserPictures(user)

        UserMessages(user)

        ProfileFooter()
    }
}