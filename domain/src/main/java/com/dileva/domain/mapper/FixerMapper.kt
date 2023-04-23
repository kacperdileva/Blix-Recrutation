package com.dileva.domain.mapper

import com.dileva.core.model.FixerDTO
import com.dileva.domain.model.Fixer
import javax.inject.Inject

class FixerMapper @Inject constructor() {

    fun map(remote: FixerDTO): Fixer =
        remote.run {
            Fixer(
                success,
                timestamp,
                base,
                date,
                rates
            )
        }
}