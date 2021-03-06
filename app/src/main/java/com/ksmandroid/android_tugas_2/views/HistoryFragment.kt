package com.ksmandroid.android_tugas_2.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ksmandroid.android_tugas_2.adapter.HistoryAdapter
import com.ksmandroid.android_tugas_2.R
import com.ksmandroid.android_tugas_2.items.HistoryItem
import kotlinx.android.synthetic.main.fragment_history.*

class HistoryFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private lateinit var adapter: HistoryAdapter
    private val list = ArrayList<HistoryItem>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.add(HistoryItem("13", "3", "25", "2416"))
        list.add(HistoryItem("21", "4", "13", "2528"))
        list.add(HistoryItem("9", "1", "9", "1216"))
        list.add(HistoryItem("4", "2", "8", "1616"))
        list.add(HistoryItem("5", "2", "3", "946"))
        list.add(HistoryItem("7", "0", "4", "1220"))
        list.add(HistoryItem("11", "5", "17", "2216"))
        list.add(HistoryItem("14", "4", "15", "2322"))

        rv_match_history.setHasFixedSize(true)
        rv_match_history.layoutManager = LinearLayoutManager(activity)

        val adapter = HistoryAdapter(list)
        rv_match_history.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }
}
