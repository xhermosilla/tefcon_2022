package com.telefonica.search.word

import io.javalin.Javalin
import io.file.File

object AppContants {
        const val FILE_DIR = "_id"
}

fun main() {
    val app = Javalin.create()
        .start(3020);

    app.get("/files/{fileName}/searchWord") { ctx ->
        val fileName = ctx.pathParam("fileName")
        val word = ctx.queryParam("word")
        ctx.result("file: " + fileName + " word: " + word  + " count: " + 0)
        
        val lines:  List<String> = File(fileName).bufferedReader().readLines()

        // const { fileName } = request.params;
        // const { word } = request.query || '';
        // const text = (await fs.readFile(path.join(FILES_PATH, fileName))).toString('utf-8');

        // const count = text.split(/[\s,.:;]+/).filter((w) => w.trim() === word).length;

        // return { file: fileName, searchWord: word, count }
    }
}