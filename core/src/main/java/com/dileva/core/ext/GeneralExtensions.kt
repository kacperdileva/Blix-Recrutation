package com.dileva.core.ext

import kotlin.math.roundToInt
import kotlin.random.Random


private const val ONE_RATE_ALPHA = 50.0

fun Double.format(digits: Int) = "%.${digits}f".format(this)

fun Int.random(until: Int) = Random.nextInt(until, this)

fun Int.getHeaderColor(header: String): String {
    var currentAlpha = 255 - ((this + 1) * ONE_RATE_ALPHA).roundToInt()
    if (currentAlpha <= 50) currentAlpha = 50
    var alphaString = Integer.toHexString(currentAlpha)
    alphaString = alphaString.padStart(2, '0')
    return "${alphaString}$header"
}