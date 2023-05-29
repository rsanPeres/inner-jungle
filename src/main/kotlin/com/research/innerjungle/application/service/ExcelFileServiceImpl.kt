package com.research.innerjungle.application.service

import com.research.innerjungle.domain.entity.ExcelFile
import org.apache.poi.ss.usermodel.Workbook
import org.bson.types.Binary
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service
import java.io.ByteArrayOutputStream

@Service
class ExcelFileServiceImpl(@Autowired val mongoTemplate: MongoTemplate) {
    fun saveExcelFile(name: String, workbook: Workbook) {
        val file = ExcelFile(name, Binary(workbookToByteArray(workbook)))
        mongoTemplate.save(file)
    }

    private fun workbookToByteArray(workbook: Workbook): ByteArray {
        val outputStream = ByteArrayOutputStream()
        workbook.write(outputStream)
        return outputStream.toByteArray()
    }
}
