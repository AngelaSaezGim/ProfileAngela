package com.angelasaez.profileangela.model

class User(
    var userName: String = "Usuario",
    var userProfilePicture: Int = 0,
    var userHobbies: List<String> = emptyList(),
    var userImages: List<Int> = emptyList(),
    var userMessages: Int = 0
)