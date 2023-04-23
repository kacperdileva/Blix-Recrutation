package com.dileva.networking.datasource

import com.dileva.core.model.FixerDTO
import com.dileva.networking.mapper.FixerResponseMapper
import com.dileva.networking.service.FixerService
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class FixerDataSourceImpl @Inject constructor(
    private val fixerService: FixerService,
    private val fixerResponseMapper: FixerResponseMapper
) : FixerDataSource {

    override fun getPrices(date: String): Single<FixerDTO> {
        val priceResponse = fixerService.getPrices(date)
        return priceResponse.map(fixerResponseMapper::map)
    }
}