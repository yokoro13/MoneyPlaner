package com.yokoro.moneyplanner.view

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import com.yokoro.moneyplanner.R


abstract class RecyclerViewAdapter<T> : RecyclerView.Adapter<RecyclerViewHolder>() {
    var list: List<T> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflate: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return RecyclerViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {}

    override fun getItemCount(): Int {
        return list.size
    }
}