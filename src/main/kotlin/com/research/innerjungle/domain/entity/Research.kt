package com.research.innerjungle.domain.entity

import java.time.LocalDate

data class Research(
    override var title : String,
    override var start : LocalDate,
    override var done : Boolean,
    val researcher : User,
    val institution : Institution,

) : ResearchBase(title, start, done){
    val eletrode : List<Eletrode> = listOf()
    val microorganismBase: List<MicroorganismBase> = listOf()
    val experiment: List<ExperimentBase> = listOf()
    val calibrationCurve: List<CalibrationCurve> = listOf()
    val nanomaterial: List<Nanomaterial> = listOf()
}
