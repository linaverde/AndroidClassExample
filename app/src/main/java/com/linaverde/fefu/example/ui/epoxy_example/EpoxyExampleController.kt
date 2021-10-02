package com.linaverde.fefu.example.ui.epoxy_example

import com.airbnb.epoxy.EpoxyController
import com.linaverde.fefu.example.ui.adapters.GridItem

class EpoxyExampleController(
    private val onTitleClickListener: () -> Unit,
    private val onItemClickListener: () -> Unit,
) : EpoxyController() {

    private val items = mutableListOf<GridItem>()

    override fun buildModels() {
        items.forEachIndexed { index, item ->
            TextViewEpoxyModel_()
                .id("title$index")
                .title(item.text)
                .titleClickListener(onTitleClickListener)
                .addTo(this)
            GridItemEpoxyModel_()
                .id("item$index")
                .item(item)
                .gridItemClickListener(onItemClickListener)
                .addIf(index % 2 == 0, this)
        }
    }

    fun setItems(items: List<GridItem>) {
        this.items.clear()
        this.items.addAll(items)
        requestModelBuild()
    }


}