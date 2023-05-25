package com.research.innerjungle.domain.entity

import java.time.LocalDate

data class CalibrationCurve(
    override var dateStart: LocalDate,
    override var objective: String,
    override var title: String
) : ElectrochemicalExperiment(title, dateStart, objective)
