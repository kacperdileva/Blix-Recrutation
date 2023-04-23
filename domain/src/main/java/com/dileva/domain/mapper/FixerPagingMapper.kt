package com.dileva.domain.mapper

import com.dileva.core.ext.getHeaderColor
import com.dileva.core.model.FixerDTO
import com.dileva.domain.model.HeaderAdapterItem
import com.dileva.domain.model.PriceAdapterItem
import com.dileva.domain.model.PricesAdapterWrapper
import com.dileva.domain.model.PricesPagingAdapterItem
import javax.inject.Inject

class FixerPagingMapper @Inject constructor() {

    fun map(remote: FixerDTO, headerColor: String): PricesPagingAdapterItem =
        PricesAdapterWrapper(
            HeaderAdapterItem(remote.date, headerColor),
        ).also { wrapper ->
            wrapper.pricesAdapterItem = mutableListOf<PriceAdapterItem>().also { list ->
                remote.rates.forEachIndexed { index, pair ->
                    list.add(
                        PriceAdapterItem(
                            pair.first,
                            pair.second,
                            index.getHeaderColor(headerColor),
                            remote.date
                        )
                    )
                }
            }
        }

    fun map(wrapper: PricesAdapterWrapper): List<PricesPagingAdapterItem> =
        wrapper.run {
            mutableListOf<PricesPagingAdapterItem>(
                headerAdapterItem
            ).also { list ->
                list.addAll(pricesAdapterItem!!)
            }
        }
}