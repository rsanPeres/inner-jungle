package com.research.innerjungle.domain.entity

import jakarta.validation.constraints.Email

data class User(
    val address: Address,
    val userName : String,
    val email: String,
    val password : String,
    val firstName : String,
    val lastName : String,
    val cpf : String
) : Entity()
