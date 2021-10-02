package com.linaverde.fefu.example.ui.epoxy_example

import android.view.View
import android.view.ViewParent
import androidx.viewbinding.ViewBinding
import com.airbnb.epoxy.EpoxyHolder

abstract class BaseEpoxyHolder<T: ViewBinding>(parent: ViewParent) : EpoxyHolder(parent) {

    abstract fun bindingFactory(view: View): T

    lateinit var binding: T
        private set

    override fun bindView(itemView: View) {
        binding = bindingFactory(itemView)
    }
}