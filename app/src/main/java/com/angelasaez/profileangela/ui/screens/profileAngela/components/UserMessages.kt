package com.angelasaez.profileangela.ui.screens.profileAngela.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelasaez.profileangela.R

@Composable
fun UserMessages(numberMessages: Int) {

    Image(
        painter = painterResource(id = R.drawable.baseline_email_24),
        contentDescription = "Hobby icon",
        modifier = Modifier
            .size(24.dp)
            .padding(end = 8.dp)
    )
    Text(
        text = "$numberMessages mensajes",
        fontSize = 18.sp
    )
}