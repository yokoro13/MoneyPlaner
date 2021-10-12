package com.yokoro.moneyplanner.view.fragment.actual

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.databinding.DataBindingUtil
import org.koin.android.ext.android.inject
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.yokoro.moneyplanner.R
import com.yokoro.moneyplanner.databinding.ActualFragmentBinding
import com.yokoro.moneyplanner.view.ActualRecyclerViewAdapter

import androidx.recyclerview.widget.RecyclerView

class ActualFragment: Fragment() {
    private val viewModel: ActualViewModel by inject()
    private lateinit var recycler: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<ActualFragmentBinding>(inflater, R.layout.main_fragment, container, false).apply {
            lifecycleOwner = this@ActualFragment
            viewmodel = viewModel
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler = view.findViewById(R.id.recycler) as RecyclerView

    }

    private fun setupRecyclerView() {
        val adapter: ActualRecyclerViewAdapter = ActualRecyclerViewAdapter()
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = adapter
        recycler.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager(activity).orientation))
        viewModel.actualIncomes.observe(this, Observer { list -> adapter.list = list })
    }
}