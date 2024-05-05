package com.example.androidlesson10.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidlesson10.Models.User
import com.example.androidlesson10.databinding.ItemCardBinding

class NameAdapter():RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    private val list= arrayListOf<String>()


    inner class NameViewHolder( val  itemCardBinding: ItemCardBinding):RecyclerView.ViewHolder(itemCardBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {

        val view = ItemCardBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return NameViewHolder(view)
    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {

        val text = list[position]

        holder.itemCardBinding.textView.text=text
    }

    fun updateList(newList: ArrayList<String>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}