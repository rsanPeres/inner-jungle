package com.research.innerjungle.domain.entity

import com.research.innerjungle.domain.enum.ExperimentStatus
import com.research.innerjungle.domain.factory.MicroorganismFactory
import java.time.LocalDate

abstract class ExperimentBase(
    open var title : String,
    open var dateStart : LocalDate,
    open var objective : String
) : Entity(){
    var dateEnd : LocalDate = LocalDate.MAX
    var status : ExperimentStatus = ExperimentStatus.PREPARATION
    val eletrodes : List<EletrodeBase> = listOf()
}
