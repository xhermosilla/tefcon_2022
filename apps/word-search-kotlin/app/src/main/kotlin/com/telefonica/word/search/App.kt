package com.telefonica.word.search

import com.google.gson.GsonBuilder
import com.telefonica.word.search.files.Views
import io.javalin.Javalin
import io.javalin.json.JsonMapper
import java.lang.reflect.Type

fun main() {
    val gson = GsonBuilder().create()

    val gsonMapper = object : JsonMapper {
        override fun <T : Any> fromJsonString(json: String, targetType: Type): T =
                gson.fromJson(json, targetType)

        override fun toJsonString(obj: Any, type: Type) =
                gson.toJson(obj)
    }

    val app = Javalin.create { it.jsonMapper(gsonMapper) }.start(3000);

    app.get("/files/{fileName}/searchWord") { Views.searchWord(it) }
}