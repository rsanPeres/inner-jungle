package com.research.innerjungle.domain.entity

import java.math.BigDecimal
import java.time.LocalDate

data class Eletrode(
    override var company : String,
    override var fabricationDate : LocalDate,
    override var typeMaterial : String,
    override var amount : Int,
    override var price : BigDecimal,
    val name : String,
    val preparationData : LocalDate

    ) : EletrodeBase(company, fabricationDate, typeMaterial, amount, price)
