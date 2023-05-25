package com.research.innerjungle.domain.entity

import java.time.LocalDate

open class ElectrochemicalExperiment(
    override var title: String,
    override var dateStart: LocalDate,
    override var objective: String
) : ExperimentBase(title, dateStart, objective)
