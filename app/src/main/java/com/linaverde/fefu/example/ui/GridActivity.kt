package com.linaverde.fefu.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.linaverde.fefu.example.R
import com.linaverde.fefu.example.databinding.ActivityGridBinding
import com.linaverde.fefu.example.ui.adapters.GridExampleAdapter
import com.linaverde.fefu.example.ui.adapters.GridItem
import com.linaverde.fefu.example.viewBinding

class GridActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityGridBinding::inflate)

    private val strings by lazy { resources.getStringArray(R.array.label_list_values_strings) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val resourses = mutableListOf<GridItem>()

        strings.forEach {
            resourses.add(GridItem(it))
        }

        binding.grid.adapter = GridExampleAdapter(this, R.layout.grid_item_layout, resourses)
    }
}