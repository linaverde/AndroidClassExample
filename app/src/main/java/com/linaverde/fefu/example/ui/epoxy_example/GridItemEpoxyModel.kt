package com.linaverde.fefu.example.ui.epoxy_example

import android.view.View
import android.view.ViewParent
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.linaverde.fefu.example.R
import com.linaverde.fefu.example.databinding.GridItemLayoutBinding
import com.linaverde.fefu.example.ui.adapters.GridItem

@EpoxyModelClass
abstract class GridItemEpoxyModel :
    BaseEpoxyModel<GridItemEpoxyHolder>(R.layout.grid_item_layout) {

    @EpoxyAttribute
    lateinit var item: GridItem

    @EpoxyAttribute
    lateinit var gridItemClickListener: () -> Unit

    override fun bind(holder: GridItemEpoxyHolder) {
        with(holder.binding) {
            tvLabel.text = item.text
            ivIcon.setImageDrawable(root.context.getDrawable(item.icon))
            root.setOnClickListener { gridItemClickListener.invoke() }
        }
    }

    override fun unbind(holder: GridItemEpoxyHolder) {
        holder.binding.root.setOnClickListener(null)
    }
}

class GridItemEpoxyHolder(viewParent: ViewParent) :
    BaseEpoxyHolder<GridItemLayoutBinding>(viewParent) {
    override fun bindingFactory(view: View): GridItemLayoutBinding =
        GridItemLayoutBinding.bind(view)
}