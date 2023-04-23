package com.dileva.core.adapter

import com.squareup.moshi.*


class PairAdapter : JsonAdapter<Pair<String, String>>() {

    @ToJson
    override fun toJson(writer: JsonWriter, value: Pair<String, String>?) {
        writer.value(value!!.first + "," + value.second)
    }

    @FromJson
    override fun fromJson(reader: JsonReader): Pair<String, String>? {
        val pair = reader.nextString()
        if (pair.length != 2) throw JsonDataException("Unknown pair: $pair")
        val second = pair.substringAfter(",")
        val first = pair.replace(second, "")
        return Pair(
            first,
            second
        )
    }
}