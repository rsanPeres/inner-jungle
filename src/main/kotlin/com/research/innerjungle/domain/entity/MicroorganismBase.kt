package com.research.innerjungle.domain.entity

import com.research.innerjungle.domain.enum.DegreePathogenicity
import com.research.innerjungle.domain.enum.DegreeVirulence
import com.research.innerjungle.domain.enum.TypeMicroorganism
import java.math.BigDecimal
import java.time.LocalDate

open class MicroorganismBase(
    override var name : String,
    override var brand : String,
    override var storageTemperature : BigDecimal,
    override var arrival: LocalDate,
    val type : TypeMicroorganism,
    open var family : String,
    open var genus : String,
    open var species : String,
    open var virulence : DegreeVirulence,
    open var pathogenicity: DegreePathogenicity
) : CharacteristicsCommercialMicroorganisms(name, brand, storageTemperature, arrival) {
    val strain : Strain = Strain("", "", BigDecimal.ZERO, LocalDate.MAX, "", BigDecimal.ZERO)
}
