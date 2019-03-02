package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger

class Heater {

    companion object {
        private const val TAG = "Heater"
    }

    private var heating = false

    fun isHeating(): Boolean = heating

    fun setHeating(heating: Boolean) {
        this.heating = heating
    }

    fun on() {
        Logger.d(TAG, "Heater : ~ ~ ~ heating ~ ~ ~")
        this.heating = true
    }

    fun off() {
        this.heating = false
    }

    fun isHot(): Boolean = heating
}