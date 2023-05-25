package com.research.innerjungle.domain.entity

import java.math.BigDecimal
import java.time.LocalDate

abstract class CharacteristicsCommercialMicroorganisms(
    open var name : String,
    open var brand : String,
    open var storageTemperature : BigDecimal,
    open var arrival : LocalDate,

) : Entity(){
    val dilution : BigDecimal = BigDecimal.ZERO
}
