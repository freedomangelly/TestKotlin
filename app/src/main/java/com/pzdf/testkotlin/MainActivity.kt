package com.pzdf.testkotlin

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : Activity() {
    private val items: List<TestPerson> = listOf(
            TestPerson(0, "Mon 6/23 - Sunny - 31/17"),
            TestPerson(0, "Tue 6/24 - Foggy - 21/8"),
            TestPerson(0, "Wed 6/25 - Cloudy - 22/17"),
            TestPerson(0, "Thurs 6/26 - Rainy - 18/11"),
            TestPerson(0, "Fri 6/27 - Foggy - 21/10"),
            TestPerson(0, "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18"),
            TestPerson(0, "Sun 6/29 - Sunny - 20/7")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var relist = find<RecyclerView>(R.id.forecast_list)
        relist.layoutManager = LinearLayoutManager(this)
        relist.adapter = ForecastListAdapter(items)

        toast("ddd")
        longToast("ffff")
    }

}