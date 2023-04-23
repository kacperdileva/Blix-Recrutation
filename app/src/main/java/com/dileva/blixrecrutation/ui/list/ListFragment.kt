package com.dileva.blixrecrutation.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.dileva.blixrecrutation.R
import com.dileva.blixrecrutation.databinding.FragmentListBinding
import com.dileva.blixrecrutation.ui.list.adapter.PricesPagingAdapter
import com.dileva.blixrecrutation.ui.list.viewholder.PricesItemViewHolder
import com.dileva.core.ext.navigateSafe
import com.dileva.domain.model.PriceAdapterItem
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment(), PricesItemViewHolder.Callback {

    private val viewModel: ListViewModel by viewModels()

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!

    private val pricesPagingAdapter by lazy {
        PricesPagingAdapter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initViewComponents()
    }

    private fun initViewModel() {
        viewModel.getPrices().observe(viewLifecycleOwner) {
            it ?: return@observe
            pricesPagingAdapter.submitData(lifecycle, it)
        }
    }

    private fun initViewComponents() {
        binding.priceRecycler.apply {
            adapter = pricesPagingAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(price: PriceAdapterItem) {
        findNavController().navigateSafe(
            R.id.listFragment,
            ListFragmentDirections.actionListFragmentToItemFragment(price)
        )
    }
}