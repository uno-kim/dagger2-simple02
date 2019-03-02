package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger
import javax.inject.Inject

class GuatemalaBean @Inject constructor() : CoffeeBean() {

    companion object {
        private const val TAG = "GuatemalaBean"
    }

    init {
        Logger.d(TAG, "GuatemalaBean() created")
    }

    override fun name() {
        Logger.d(TAG, "GuatemalaBean")
    }
}