package com.linaverde.fefu.example

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.linaverde.fefu.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSecondActivity.setOnClickListener {
            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            startActivity(secondActivityIntent)
        }

        binding.btnFragmentActivity.setOnClickListener {
            val fragmentActivityIntent =
                Intent(this@MainActivity, FragmentActivity::class.java)
            startActivity(fragmentActivityIntent)
        }

        binding.btnCallIntent?.setOnClickListener {
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:8 (800) 550-38-38")))
        }

    }
}