package com.yokoro.moneyplanner.view

import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome
import com.yokoro.moneyplanner.domain.usecase.Either

class ActualRecyclerViewAdapter : RecyclerViewAdapter<ActualIncome>() {
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.titleView.text =
            when(val r = list[position].reason.value) {
                is Either.Specify -> r.value
                else -> ""
            }
    }
}