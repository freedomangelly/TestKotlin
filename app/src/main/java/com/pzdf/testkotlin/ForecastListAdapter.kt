package com.pzdf.testkotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class ForecastListAdapter(var list:List<Person>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){
    var items = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var text=TextView(parent.context)
        text.setTextColor(parent.context.resources.getColor(android.R.color.black))
        return ViewHolder(text)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items.get(position).name
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}