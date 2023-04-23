package com.dileva.blixrecrutation.ui.item

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.dileva.blixrecrutation.databinding.FragmentItemBinding
import com.dileva.core.ext.format
import com.dileva.uicomponents.ext.perform
import com.dileva.uicomponents.ext.setOnClick

class ItemFragment : Fragment() {

    private val args: ItemFragmentArgs by navArgs()

    private var _binding: FragmentItemBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewComponents()
    }

    private fun initViewComponents() {
        binding.apply {
            args.price.apply {
                titleLabel.text = title
                priceLabel.text = rateValue!!.format(PRICE_FORMAT)
                dateLabel.text = date
                root.setBackgroundColor(Color.parseColor("#$hex"))

                listOf(
                    backButton,
                    backLabel
                ).perform {
                    setOnClick(::navigateBack)
                }
            }
        }
    }

    private fun navigateBack() {
        findNavController().navigateUp()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val PRICE_FORMAT = 4
    }
}