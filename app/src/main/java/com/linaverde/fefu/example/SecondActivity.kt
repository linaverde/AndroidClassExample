package com.linaverde.fefu.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.linaverde.fefu.example.databinding.ActivitySecondBinding

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