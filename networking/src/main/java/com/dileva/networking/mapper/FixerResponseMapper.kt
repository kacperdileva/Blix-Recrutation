package com.dileva.networking.mapper

import com.dileva.core.model.FixerDTO
import com.dileva.networking.model.FixerResponse
import javax.inject.Inject

class FixerResponseMapper @Inject constructor() {

    fun map(remote: FixerResponse): FixerDTO =
        remote.run {
            FixerDTO(
                success,
                timestamp,
                base,
                date,
                rates.toList()
            )
        }
}