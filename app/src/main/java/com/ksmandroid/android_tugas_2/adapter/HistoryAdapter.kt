package com.ksmandroid.android_tugas_2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import com.ksmandroid.android_tugas_2.adapter.HistoryListAdapter.CategoryViewHolder
import java.util.*

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ksmandroid.android_tugas_2.R

class HistoryListAdapter(var context: Context) :
    RecyclerView.Adapter<CategoryViewHolder?>() {
    var listFruit: ArrayList<Fruit>? = null

    @NonNull
    fun onCreateViewHolder(@NonNull viewGroup: ViewGroup, i: Int): CategoryViewHolder {
        val itemRow: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_match_history, viewGroup, false)
        return CategoryViewHolder(itemRow)
    }

    fun onBindViewHolder(@NonNull categoryViewHolder: CategoryViewHolder, i: Int) {
        categoryViewHolder.tvName.setText(listFruit!![i].getName())
        categoryViewHolder.tvComposition.setText(listFruit!![i].getComposition())
        Glide.with(context)
            .load(listFruit!![i].getPhoto())
            .apply(RequestOptions().override(55, 55))
            .into(categoryViewHolder.imgPhoto)
    }

    val itemCount: Int
        get() = listFruit!!.size

    inner class CategoryViewHolder internal constructor(@NonNull itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var tvName: TextView
        var tvComposition: TextView
        var imgPhoto: ImageView

        init {
            tvName = itemView.findViewById(R.id.tv_item_name)
            tvComposition = itemView.findViewById(R.id.tv_item_composition)
            imgPhoto = itemView.findViewById(R.id.img_item_photo)
        }
    }
}