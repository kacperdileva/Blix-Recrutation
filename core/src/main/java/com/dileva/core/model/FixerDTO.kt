package com.dileva.core.model

data class FixerDTO(
    val success: Boolean,
    val timestamp: Long?,
    val base: String?,
    val date: String,
    val rates: List<Pair<String, Double?>>
)