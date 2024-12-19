package com.angelasaez.profileangela.ui.screens

import android.media.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

@Composable
fun ProfileAngela(modifier: Modifier) {

    var userName by rememberSaveable {mutableStateOf("Angela")}

    //Columna principal applicación
    Column (
        modifier = Modifier.fillMaxSize().then(modifier),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = userName,
            fontSize = 25.sp
        )

        Image(
            painter = painterResource(id=R)
        )

    }
}