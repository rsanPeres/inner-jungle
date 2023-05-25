package com.research.innerjungle.domain.entity

data class Institution(
    val name : String,
    val address: Address
) : Entity()
