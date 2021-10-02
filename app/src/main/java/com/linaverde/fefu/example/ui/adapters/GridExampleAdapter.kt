package com.linaverde.fefu.example.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.linaverde.fefu.example.R

class GridExampleAdapter internal constructor(
    context: Context,
    private val resource: Int,
    private val itemList: List<GridItem>
) : ArrayAdapter<GridItem>(context, resource) {

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val childView = LayoutInflater.from(context).inflate(resource, null)
        (childView!!.findViewById(R.id.tvLabel) as TextView).text = itemList[position].text
        (childView.findViewById(R.id.ivIcon) as ImageView).setImageResource(itemList[position].icon)

        return childView
    }

}
