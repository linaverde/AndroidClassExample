package com.linaverde.fefu.example.ui.adapters

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.linaverde.fefu.example.R
import kotlinx.android.synthetic.main.list_item_text_view.view.*

class RecyclerViewAdapter(
    private val itemClickListenerFun: (Int) -> Unit,
    private val myClickListenerInstance: MyClickListener
) : RecyclerView.Adapter<RecyclerViewAdapter.TextViewHolder>() {

    private val data = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_text_view, parent, false)
        return TextViewHolder(view)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.bind(data[position])

        holder.itemView.setOnClickListener {
            itemClickListenerFun.invoke(42)
            myClickListenerInstance.onItemClicked(42)
        }
    }

    override fun getItemCount(): Int = data.size


    fun setData(newData: List<String>) {
        data.clear()
        data.addAll(newData)
    }

    interface MyClickListener {
        fun onItemClicked(id: Int)
    }

    class TextViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(data: String) {
            itemView.tvTitle.text = data
        }

    }
}


