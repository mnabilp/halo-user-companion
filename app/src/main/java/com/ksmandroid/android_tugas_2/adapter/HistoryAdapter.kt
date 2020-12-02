package com.ksmandroid.android_tugas_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ksmandroid.android_tugas_2.R
import com.ksmandroid.android_tugas_2.items.HistoryItem
import kotlinx.android.synthetic.main.item_match_history.view.*

class HistoryAdapter(private val items: List<HistoryItem>) :
    RecyclerView.Adapter<HistoryAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainViewHolder =
        MainViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_match_history, p0, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(p0: MainViewHolder, p1: Int) {
        p0.bind(items.get(p1), p1 + 1)
    }

    inner class MainViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: HistoryItem, i: Int) {
            //view.iv_profile.image = "$i"
            view.tv_match_kill.text = item.name
            view.tv_match_deaths.text = item.description
        }
    }
}