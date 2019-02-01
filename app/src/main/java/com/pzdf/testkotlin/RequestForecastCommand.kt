package com.pzdf.testkotlin

import com.pzdf.testkotlin.domain.Command
import com.pzdf.testkotlin.domain.ForecastList

class RequestForecastCommand(val zipCode: String) :
        Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(
                forecastRequest.execute())
    }
}