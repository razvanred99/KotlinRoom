package com.example.studente.kotlinroom.model

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.studente.kotlinroom.R
import kotlinx.android.synthetic.main.card_view.view.*

/**
 * Created by studente on 06/04/2018.
 */
class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun getItemCount() = AppDatabase.getDatabase().personDao().countPeople()

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        val obj=AppDatabase.getDatabase().personDao().getById(position)

        if (holder != null) {
            holder.txvName.text = obj.name
            holder.txvAge.text=obj.age.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.card_view, parent, false))
    }

    class ViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {
        val txvName: TextView = layout.findViewById(R.id.txvName)
        val txvAge: TextView = layout.findViewById(R.id.txvAge)
    }

}