package com.dileva.core.ext

import java.text.SimpleDateFormat
import java.util.*
import org.apache.commons.lang3.time.DateUtils as DateUtilsFormat

private val WHITE_INT = 16777215
private const val YEAR_DAY_MONTH = "yyyy-MM-dd"
private const val ONE_DAY_COLOR = 45964.97260273973

fun Date.getCorrectDate(days: Int): String {
    val date = DateUtilsFormat.addDays(this, -days)
    val sdf = SimpleDateFormat(YEAR_DAY_MONTH, Locale.getDefault())
    return (sdf.format(date))
}

fun Date.getRandomBackgroundColor(): String {
    val days = 365
    var hexColor = (ONE_DAY_COLOR * days.random(0)).toInt()
    if (hexColor == 0) hexColor = WHITE_INT
    return Integer.toHexString(hexColor).padStart(6, '0')
}
