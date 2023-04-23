package com.dileva.networking.datasource

import com.dileva.core.model.FixerDTO
import io.reactivex.rxjava3.core.Single

interface FixerDataSource {

    fun getPrices(date: String): Single<FixerDTO>
}