package com.dileva.blixrecrutation.ui.list.viewholder

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.dileva.core.ext.format
import com.dileva.domain.model.PriceAdapterItem
import com.dileva.uicomponents.databinding.ItemPriceBinding
import com.dileva.uicomponents.ext.setOnClick

class PricesItemViewHolder(
    private val binding: ItemPriceBinding,
    private val callback: Callback
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(prices: PriceAdapterItem) {
        binding.apply {
            prices.apply {
                titleLabel.text = title
                priceLabel.text = rateValue!!.format(PRICE_FORMAT)
                root.setOnClick(this, callback::onClick)
                root.setBackgroundColor(Color.parseColor("#$hex"))
            }
        }
    }

    companion object {
        private const val PRICE_FORMAT = 4
    }

    interface Callback {
        fun onClick(price: PriceAdapterItem)
    }
}