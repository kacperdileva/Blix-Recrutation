package com.dileva.blixrecrutation.ui.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dileva.blixrecrutation.databinding.ItemHeaderBinding
import com.dileva.blixrecrutation.ui.list.viewholder.HeaderItemViewHolder
import com.dileva.blixrecrutation.ui.list.viewholder.PricesItemViewHolder
import com.dileva.domain.model.*
import com.dileva.uicomponents.databinding.ItemPriceBinding

class PricesPagingAdapter constructor(
    private val callback: PricesItemViewHolder.Callback
) : PagingDataAdapter<PricesPagingAdapterItem, RecyclerView.ViewHolder>(
    PRICES_ADAPTER_ITEM_DIFF_CALLBACK
) {

    private lateinit var inflater: LayoutInflater

    override fun getItemViewType(position: Int): Int =
        getItem(position)!!.viewType.value   //non-null assertion (!!) as item may not be a placeholder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (!::inflater.isInitialized) inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ViewType.HEADER.value -> {
                with(ItemHeaderBinding.inflate(inflater, parent, false)) {
                    HeaderItemViewHolder(this)
                }
            }
            ViewType.PRICE.value -> {
                with(ItemPriceBinding.inflate(inflater, parent, false)) {
                    PricesItemViewHolder(this, callback)
                }
            }
            else -> throw NoSuchElementException("No ViewHolder associated with viewType $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = getItem(position)) {
            is HeaderAdapterItem -> (holder as HeaderItemViewHolder).bind(item)
            is PriceAdapterItem -> (holder as PricesItemViewHolder).bind(item)
            else -> throw NoSuchElementException("Unable to bind item $item")
        }
    }
}