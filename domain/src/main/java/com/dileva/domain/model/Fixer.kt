package com.dileva.domain.model

data class Fixer(
    val success: Boolean,
    val timestamp: Long?,
    val base: String?,
    val date: String,
    val rates: List<Pair<String, Double?>>
)