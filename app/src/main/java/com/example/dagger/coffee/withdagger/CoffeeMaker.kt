package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger
import javax.inject.Inject

class CoffeeMaker {

    companion object {
        private const val TAG = "CoffeeMaker"
    }

    private lateinit var heater: Heater

    constructor() {
        Logger.d(TAG, "CoffeeMaker() created")
    }

    @Inject
    constructor(heater: Heater) {
        this.heater = heater
        Logger.d(TAG, "CoffeeMaker($heater) created")
    }

    fun brew(coffeeBean: CoffeeBean) {
        Logger.d(TAG, "CoffeeBean ($coffeeBean) [_]P coffee! [_]P ")
    }
}
