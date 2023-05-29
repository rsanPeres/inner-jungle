package com.research.innerjungle.web.controller

import com.research.innerjungle.application.service.ExcelFileServiceImpl
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class ExcelFileController(
    @Autowired val service: ExcelFileServiceImpl) {
    @PostMapping("/arquivos/excel")
    fun uploadArquivoExcel(@RequestParam("name") name: String, @RequestParam("file") arquivo: MultipartFile) {
        val workbook = XSSFWorkbook(arquivo.inputStream)
        service.saveExcelFile(name, workbook)
    }
}