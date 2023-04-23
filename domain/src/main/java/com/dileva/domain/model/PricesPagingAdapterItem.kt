package com.dileva.domain.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

sealed interface PricesPagingAdapterItem {
    val viewType: ViewType
}

enum class ViewType(val value: Int) {
    WRAPPER(0),
    HEADER(1),
    PRICE(2),
}

data class HeaderAdapterItem(
    val title: String,
    val hex: String
) : PricesPagingAdapterItem {
    override val viewType: ViewType = ViewType.HEADER
}

data class PricesAdapterWrapper(
    val headerAdapterItem: HeaderAdapterItem,
    var pricesAdapterItem: List<PriceAdapterItem>? = null
) : PricesPagingAdapterItem {
    override val viewType: ViewType = ViewType.WRAPPER
}

@Parcelize
data class PriceAdapterItem(
    val title: String,
    val rateValue: Double?,
    val hex: String,
    val date: String
) : PricesPagingAdapterItem, Parcelable {
    @IgnoredOnParcel
    override val viewType: ViewType = ViewType.PRICE
}

val PRICES_ADAPTER_ITEM_DIFF_CALLBACK =
    object : DiffUtil.ItemCallback<PricesPagingAdapterItem>() {
        override fun areItemsTheSame(
            oldItem: PricesPagingAdapterItem,
            newItem: PricesPagingAdapterItem
        ): Boolean {
            return when {
                oldItem is HeaderAdapterItem && newItem is HeaderAdapterItem && oldItem == newItem -> true
                oldItem is PriceAdapterItem && newItem is PriceAdapterItem && oldItem == newItem -> true
                else -> false
            }
        }

        override fun areContentsTheSame(
            oldItem: PricesPagingAdapterItem,
            newItem: PricesPagingAdapterItem
        ): Boolean {
            return when {
                oldItem is HeaderAdapterItem && newItem is HeaderAdapterItem && oldItem.title == newItem.title -> true
                oldItem is PriceAdapterItem && newItem is PriceAdapterItem && oldItem.title == newItem.title -> true
                else -> false
            }
        }
    }