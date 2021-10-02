package com.linaverde.fefu.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.linaverde.fefu.example.R
import com.linaverde.fefu.example.databinding.ActivityEpoxyBinding
import com.linaverde.fefu.example.ui.adapters.GridItem
import com.linaverde.fefu.example.ui.epoxy_example.EpoxyDecorator
import com.linaverde.fefu.example.ui.epoxy_example.EpoxyExampleController
import com.linaverde.fefu.example.viewBinding

class EpoxyActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityEpoxyBinding::inflate)

    private val controller by lazy {
        EpoxyExampleController(
            this::onTitleClick,
            this::onItemClick
        )
    }

    private val strings by lazy { resources.getStringArray(R.array.label_list_values_strings) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvEpoxy.setController(controller)
        binding.rvEpoxy.addItemDecoration(EpoxyDecorator(this))

        val resources = mutableListOf<GridItem>()

        strings.forEach {
            resources.add(GridItem(it))
        }

        controller.setItems(resources)
    }

    private fun onTitleClick() {
        Toast.makeText(this, "Title clicked", Toast.LENGTH_SHORT).show()
    }

    private fun onItemClick() {
        Toast.makeText(this, "Item clicked", Toast.LENGTH_SHORT).show()
    }
}