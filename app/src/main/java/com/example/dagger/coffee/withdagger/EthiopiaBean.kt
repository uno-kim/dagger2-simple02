package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger
import javax.inject.Inject

class EthiopiaBean @Inject constructor() : CoffeeBean() {

    companion object {
        private const val TAG = "EthiopiaBean"
    }

    init {
        Logger.d(TAG, "EthiopiaBean() created")
    }

    override fun name() {
        Logger.d(TAG, "EthiopiaBean")
    }
}