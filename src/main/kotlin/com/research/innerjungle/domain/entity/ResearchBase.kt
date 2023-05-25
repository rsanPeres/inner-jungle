package com.research.innerjungle.domain.entity

import java.time.LocalDate

abstract class ResearchBase(
    open val title : String,
    open val start : LocalDate,
    open val done : Boolean,
) : Entity(){
    val authors : List<User> = listOf()
    val end : LocalDate = LocalDate.MAX
}