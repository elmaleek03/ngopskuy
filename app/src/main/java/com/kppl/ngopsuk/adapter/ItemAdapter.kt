package com.kppl.ngopsuk.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kppl.ngopsuk.R

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 7

}