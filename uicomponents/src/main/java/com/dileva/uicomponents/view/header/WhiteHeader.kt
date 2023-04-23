package com.dileva.uicomponents.view.header

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.dileva.uicomponents.R
import com.dileva.uicomponents.databinding.HeaderWhiteBinding

class WhiteHeader(
    context: Context,
    private val attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private var headerTitle: String = ""
    private var headerBaseCurrency: String = ""
    private val binding: HeaderWhiteBinding =
        HeaderWhiteBinding.inflate(LayoutInflater.from(context), this, true)

    val title = binding.headerTitle
    val baseCurrency = binding.headerBaseCurrency
    val chevronDown = binding.chevronDown

    init {
        obtainAttrs()
        initView()
    }

    private fun obtainAttrs() {
        val typedArray = context.obtainStyledAttributes(
            attrs, R.styleable.WhiteHeader, 0, 0
        )

        headerTitle = typedArray.getString(R.styleable.WhiteHeader_title) ?: ""
        headerBaseCurrency = typedArray.getString(R.styleable.WhiteHeader_baseCurrency) ?: ""
        typedArray.recycle()
    }

    private fun initView() {
        binding.headerTitle.text = headerTitle
        binding.headerBaseCurrency.text = headerBaseCurrency
    }
}