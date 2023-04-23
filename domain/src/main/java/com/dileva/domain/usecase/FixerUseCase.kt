package com.dileva.domain.usecase

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.dileva.domain.model.PricesPagingAdapterItem
import com.dileva.domain.source.GetPricesPagingSource
import javax.inject.Inject

sealed class FixerUseCase {

    class GetPricesPaging @Inject constructor(
        private val pricesPagingSource: GetPricesPagingSource
    ) : FixerUseCase() {

        operator fun invoke(): LiveData<PagingData<PricesPagingAdapterItem>> = Pager(
            config = PagingConfig(
                pageSize = PAGE_SIZE,
                enablePlaceholders = ENABLE_PLACE_HOLDERS,
                maxSize = MAX_SIZE,
                prefetchDistance = PREFETCH_DISTANCE,
                initialLoadSize = INITIAL_LOAD_SIZE
            ),
            pagingSourceFactory = { pricesPagingSource }
        ).liveData
    }

    companion object {
        private const val PAGE_SIZE = 20
        private const val ENABLE_PLACE_HOLDERS = true
        private const val MAX_SIZE = 30
        private const val PREFETCH_DISTANCE = 5
        private const val INITIAL_LOAD_SIZE = 40
    }
}