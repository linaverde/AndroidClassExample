package com.linaverde.fefu.example.ui.epoxy_example

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.linaverde.fefu.example.R
import com.linaverde.fefu.example.databinding.ListItemTextViewBinding

@EpoxyModelClass
abstract class TextViewEpoxyModel :
    BaseEpoxyModel<TextViewEpoxyHolder>(R.layout.list_item_text_view) {

    @EpoxyAttribute
    lateinit var title: String

    @EpoxyAttribute
    lateinit var titleClickListener: () -> Unit

    override fun bind(holder: TextViewEpoxyHolder) {
        holder.binding.tvTitle.text = title
        holder.binding.root.setOnClickListener { titleClickListener.invoke() }
    }

    override fun unbind(holder: TextViewEpoxyHolder) {
        holder.binding.root.setOnClickListener(null)
    }
}

class TextViewEpoxyHolder(viewParent: ViewParent) :
    BaseEpoxyHolder<ListItemTextViewBinding>(viewParent) {
    override fun bindingFactory(view: View): ListItemTextViewBinding =
        ListItemTextViewBinding.bind(view)
}