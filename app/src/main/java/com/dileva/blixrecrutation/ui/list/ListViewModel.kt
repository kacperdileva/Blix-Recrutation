package com.dileva.blixrecrutation.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.dileva.domain.model.PricesPagingAdapterItem
import com.dileva.domain.usecase.FixerUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val pricesUseCase: FixerUseCase.GetPricesPaging
) : ViewModel() {

    fun getPrices(): LiveData<PagingData<PricesPagingAdapterItem>> {
        return pricesUseCase()
            .cachedIn(viewModelScope)
    }
}