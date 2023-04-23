package com.dileva.uicomponents.view.priceItem

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.dileva.uicomponents.R
import com.dileva.uicomponents.databinding.ItemPriceBinding
import com.dileva.uicomponents.ext.setVisibility

class PriceItem(
    context: Context,
    private val attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val binding: ItemPriceBinding =
        ItemPriceBinding.inflate(LayoutInflater.from(context), this, true)

    var title: String
        get() = binding.titleLabel.text.toString()
        set(value) {
            binding.titleLabel.text = value
        }

    var price: String
        get() = binding.priceLabel.text.toString()
        set(value) {
            binding.priceLabel.apply {
                setVisibility(value.isNotEmpty())
                title = value
            }
        }

    init {
        obtainAttrs()
    }

    private fun obtainAttrs() {
        val typedArray = context.obtainStyledAttributes(
            attrs, R.styleable.ItemPrice, 0, 0
        )
        if (typedArray.hasValue(R.styleable.ItemPrice_title)) {
            title = typedArray.getString(R.styleable.ItemPrice_title)!!
        }
        if (typedArray.hasValue(R.styleable.ItemPrice_price)) {
            price = typedArray.getString(R.styleable.ItemPrice_price)!!
        }

        typedArray.recycle()
    }
}