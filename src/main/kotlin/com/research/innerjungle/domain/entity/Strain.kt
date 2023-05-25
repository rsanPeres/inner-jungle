package com.research.innerjungle.domain.entity

import java.math.BigDecimal
import java.time.LocalDate

data class Strain(
    override var name :String,
    override var brand : String,
    override var storageTemperature : BigDecimal,
    override var arrival : LocalDate,
    val growthMedium : String,
    val growthTemperature : BigDecimal
) : CharacteristicsCommercialMicroorganisms(name, brand, storageTemperature, arrival)
