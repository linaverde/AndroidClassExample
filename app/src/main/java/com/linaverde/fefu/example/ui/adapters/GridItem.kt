package com.linaverde.fefu.example.ui.adapters

import androidx.annotation.DrawableRes
import com.linaverde.fefu.example.R

data class GridItem(
    val text: String,
    @DrawableRes
    val icon: Int = R.drawable.ic_sample_icon
)