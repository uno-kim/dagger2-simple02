package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger
import javax.inject.Inject

class CoffeeMaker @Inject constructor(val heater: Heater) {

    companion object {
        private const val TAG = "CoffeeMaker"
    }

    fun brew(coffeeBean: CoffeeBean) {
        Logger.d(TAG, "CoffeeBean ($coffeeBean) [_]P coffee! [_]P ")
    }
}
