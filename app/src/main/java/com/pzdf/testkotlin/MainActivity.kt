package com.pzdf.testkotlin

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import org.jetbrains.anko.*
import java.util.*

class MainActivity : Activity() {
    var TAG="MainActivity"

    private val items: List<TestPerson> = listOf(
            TestPerson(0, "Mon 6/23 - Sunny - 31/17"),
            TestPerson(0, "Tue 6/24 - Foggy - 21/8"),
            TestPerson(0, "Wed 6/25 - Cloudy - 22/17"),
            TestPerson(0, "Thurs 6/26 - Rainy - 18/11"),
            TestPerson(0, "Fri 6/27 - Foggy - 21/10"),
            TestPerson(0, "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18"),
            TestPerson(0, "Sun 6/29 - Sunny - 20/7")
    )

    var url="";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var relist = find<RecyclerView>(R.id.forecast_list)
        relist.layoutManager = LinearLayoutManager(this)
//        relist.adapter = ForecastListAdapter(items)
        var a=0;
        var b=1;
        var c=a + b
        toast("ddd")
        longToast("ffff")
        doAsync {
//            Request(url).run();
            uiThread { longToast("Request performed") }
        }

        val f1 = Forecast2(Date(), 27.5f, "Shiny day")
        val f2 = f1.copy(temperature = 30f)
        Log.i(TAG,"f1 date=${f1.date},temperature=${f1.temperature},details=${f1.details}")
        Log.i(TAG,"f1 date=${f1.component1()},temperature=${f1.component2()},details=${f1.component3()}")
        Log.i(TAG,"f2 date=${f2.date},temperature=${f2.temperature},details=${f2.details}")
        doAsync() {
            val result = RequestForecastCommand("94043").execute()
            uiThread{
                relist.adapter = ForecastListAdapter(result)
            }
        }
    }

}