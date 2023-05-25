package com.research.innerjungle.domain.entity

import java.math.BigDecimal
import java.time.LocalDate

abstract class EletrodeBase (
    open var company : String,
    open var fabricationDate : LocalDate,
    open var typeMaterial : String,
    open var amount : Int,
    open var price : BigDecimal
) : Entity()