package com.halifa.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecherchesListAdapter(val products: List<RecherchesItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // c/c
        return RecherchesItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recherches_cell, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        val item = holder as RecherchesItemViewHolder
        item.bindProduct(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

}