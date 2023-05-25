package com.research.innerjungle.domain.entity

data class Nanomaterial(
    val polimer : String,
    val nanomaterials : List<String>
) : Entity()
