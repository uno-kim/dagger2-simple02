package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger

open class CoffeeBean() {

    companion object {
        private const val TAG = "CoffeeBean"
    }

    init {
        Logger.d(TAG, "CoffeeBean() created")
    }

    open fun name() {
        Logger.d(TAG, "CoffeeBean")
    }
}