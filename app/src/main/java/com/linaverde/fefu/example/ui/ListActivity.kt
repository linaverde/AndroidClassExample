package com.linaverde.fefu.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.linaverde.fefu.example.R
import com.linaverde.fefu.example.databinding.ActivityListBinding
import com.linaverde.fefu.example.viewBinding

class ListActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityListBinding::inflate)

    private val strings by lazy { resources.getStringArray(R.array.label_list_values_strings) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.lvStrings.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings)
    }
}