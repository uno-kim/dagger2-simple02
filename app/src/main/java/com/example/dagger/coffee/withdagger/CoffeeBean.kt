package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger

class CoffeeBean {

    companion object {
        private const val TAG = "CoffeeBean"
    }

    fun name() {
        Logger.d(TAG, "CoffeeBean")
    }
}