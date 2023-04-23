package com.dileva.networking.service

import com.dileva.networking.model.FixerResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface FixerService {

    @GET("/{date}")
    fun getPrices(
        @Path("date") date: String
    ): Single<FixerResponse>
}