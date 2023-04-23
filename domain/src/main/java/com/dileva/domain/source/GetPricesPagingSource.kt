package com.dileva.domain.source

import androidx.paging.PagingState
import androidx.paging.rxjava3.RxPagingSource
import com.dileva.core.ext.getCorrectDate
import com.dileva.core.ext.getRandomBackgroundColor
import com.dileva.domain.mapper.FixerPagingMapper
import com.dileva.domain.model.PricesAdapterWrapper
import com.dileva.domain.model.PricesPagingAdapterItem
import com.dileva.networking.datasource.FixerDataSource
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.*
import javax.inject.Inject

class GetPricesPagingSource @Inject constructor(
    private val fixerDataSource: FixerDataSource,
    private val fixerPagingMapper: FixerPagingMapper
) : RxPagingSource<Int, PricesPagingAdapterItem>() {

    override fun loadSingle(params: LoadParams<Int>): Single<LoadResult<Int, PricesPagingAdapterItem>> {
        val position = params.key ?: 0
        val date = Date()
        val correctDate = date.getCorrectDate(position)
        val headerDateColor = date.getRandomBackgroundColor()

        val pricesResult = fixerDataSource.getPrices(correctDate)
        return pricesResult
            .subscribeOn(Schedulers.io())
            .map { fixerPagingMapper.map(it, headerDateColor) }
            .map { toLoadResult(it, position) }
            .onErrorReturn {
                it.printStackTrace()
                LoadResult.Error(it)
            }
    }

    private fun toLoadResult(
        data: PricesPagingAdapterItem,
        position: Int
    ): LoadResult<Int, PricesPagingAdapterItem> {
        val wrapper = data as PricesAdapterWrapper
        val items = fixerPagingMapper.map(wrapper)
        return LoadResult.Page(
            data = items,
            prevKey = if (position == 0) null else position - 1,
            nextKey = if (position == items.size - 1) null else position + 1
        )
    }

    override fun getRefreshKey(state: PagingState<Int, PricesPagingAdapterItem>): Int? =
        state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
}