package com.research.innerjungle.domain.entity

import org.bson.types.Binary
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "research_files")
data class ExcelFile(
    @Id
    val name: String,
    val data: Binary
)