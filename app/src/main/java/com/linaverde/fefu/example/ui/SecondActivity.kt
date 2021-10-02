package com.linaverde.fefu.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.linaverde.fefu.example.databinding.ActivitySecondBinding
import com.linaverde.fefu.example.viewBinding

class SecondActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivitySecondBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding) {
            toolbar?.setNavigationOnClickListener {
                finish()
            }
        }

    }
}