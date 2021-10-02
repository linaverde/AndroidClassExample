package com.linaverde.fefu.example.ui.epoxy_example

import androidx.annotation.LayoutRes
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder

abstract class BaseEpoxyModel<VH : EpoxyHolder>(@LayoutRes private val layoutId: Int) : EpoxyModelWithHolder<VH>() {

    override fun getDefaultLayout(): Int = layoutId

}