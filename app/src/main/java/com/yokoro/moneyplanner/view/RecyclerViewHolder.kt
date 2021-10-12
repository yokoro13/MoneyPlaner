package com.yokoro.moneyplanner.view

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.yokoro.moneyplanner.R


class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var titleView: TextView = itemView.findViewById(R.id.title)
    var detailView: TextView = itemView.findViewById(R.id.detail)
}