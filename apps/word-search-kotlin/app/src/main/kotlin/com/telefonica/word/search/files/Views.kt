package com.telefonica.word.search.files

import io.javalin.http.Context
import java.io.File
import java.nio.file.Paths

object AppConstants {
    const val FILES_PATH = "../../assets/files"
}

class Views {
    companion object {
        fun searchWord(ctx: Context) {
            val fileName = ctx.pathParam("fileName")
            val word = ctx.queryParam("word")
            val path = Paths.get("${AppConstants.FILES_PATH}/$fileName").toAbsolutePath().toString()
            val text = File(path).bufferedReader().readText()

            val count = text.split("[\\s,.:;]+".toRegex()).count { w -> w == word }

            ctx.json(mapOf("file" to fileName, "word" to word, "count" to count))
        }
    }
}