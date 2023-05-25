package com.research.innerjungle.domain.entity

import com.research.innerjungle.domain.enum.DegreePathogenicity
import com.research.innerjungle.domain.enum.DegreeVirulence
import com.research.innerjungle.domain.enum.TypeMicroorganism
import java.math.BigDecimal
import java.time.LocalDate

data class Protozoan(
    override var name : String,
    override var brand : String,
    override var storageTemperature : BigDecimal,
    override var arrival : LocalDate,
    var typeMicroorganism : TypeMicroorganism,
    override var family : String,
    override var genus : String,
    override var species : String,
    override var virulence : DegreeVirulence,
    override  var pathogenicity : DegreePathogenicity
) : MicroorganismBase(name, brand, storageTemperature, arrival, typeMicroorganism, family, genus, species, virulence, pathogenicity)

