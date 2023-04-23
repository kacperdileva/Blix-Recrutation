package com.dileva.blixrecrutation.ui.list.viewholder

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.dileva.blixrecrutation.databinding.ItemHeaderBinding
import com.dileva.domain.model.HeaderAdapterItem

class HeaderItemViewHolder(
    private val binding: ItemHeaderBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(header: HeaderAdapterItem) {
        binding.apply {
            header.apply {
                titleLabel.text = title
                dataBox.setBackgroundColor(Color.parseColor("#$hex"))
            }
        }
    }
}