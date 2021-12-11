package com.linaverde.fefu.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.linaverde.fefu.example.R
import com.linaverde.fefu.example.databinding.ActivityListBinding
import com.linaverde.fefu.example.ui.adapters.RecyclerViewAdapter
import com.linaverde.fefu.example.viewBinding

class ListActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityListBinding::inflate)

    private val strings by lazy { resources.getStringArray(R.array.label_list_values_strings) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.lvStrings.adapter =
            RecyclerViewAdapter(this::changeFragment,
                object : RecyclerViewAdapter.MyClickListener {
                    override fun onItemClicked(id: Int) {
                        //действия действия
                    }

                }
            )
    }

    private fun changeFragment(itemId: Int) {
        //действия действия
    }
}