package com.pzdf.testkotlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.pzdf.testkotlin.domain.ForecastList

class ForecastListAdapter(val weekForecast: ForecastList) :
        RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): ViewHolder {
        return ViewHolder(TextView(parent.getContext()))
    }

    override fun onBindViewHolder(holder: ViewHolder,
                                  position: Int) {
        with(weekForecast.dailyForecast[position]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.dailyForecast.size
    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
