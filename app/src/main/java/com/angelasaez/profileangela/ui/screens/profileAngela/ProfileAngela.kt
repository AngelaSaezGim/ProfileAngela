package com.angelasaez.profileangela.ui.screens.profileAngela

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.angelasaez.profileangela.R
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserCard
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserHobbies
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserMessages
import com.angelasaez.profileangela.ui.screens.profileAngela.components.UserPictures

@Composable
fun ProfileAngela(modifier: Modifier) {

    val userName by rememberSaveable { mutableStateOf("Ángela") }
    val profilePicture = R.drawable.foto_perfil


    //Columna principal applicación
    Column (
        modifier = Modifier.fillMaxSize().then(modifier),
        verticalArrangement = Arrangement.Top,
    )
    {

        UserCard(
            userName = userName,
            profilePicture = profilePicture
        )

        val hobbies = listOf("Leer", "Escribir", "Fotografía", "Cocinar", "Viajar")
        UserHobbies(hobbies=hobbies)

        UserPictures(
            picture1 = profilePicture,
            picture2 = profilePicture
        )

        UserMessages(
            numberMessages = 5
        )



    }
}