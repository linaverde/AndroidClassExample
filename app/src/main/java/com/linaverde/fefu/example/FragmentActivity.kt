package com.linaverde.fefu.example

import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.linaverde.fefu.example.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity(), FragmentActivityListener {

    private val binding by viewBinding(ActivityFragmentBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        addFragment(LeftFragment.newInstance("one", "two"), binding.containerTop.id)
        addFragment(RightFragment.newInstance("one", "two"), binding.containerBottom.id)

    }


    override fun fragmentClicked() {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
    }
}