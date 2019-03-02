package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger
import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {

    companion object {
        private const val TAG = "CoffeeModule"
    }

    @CoffeeScope
    @Provides
    fun provideCoffeeMaker(heater: Heater): CoffeeMaker {
        Logger.d(TAG, "provideCoffeeMaker()")
        return CoffeeMaker(heater)
    }

    @CoffeeScope
    @Provides
    fun provideHeater(): Heater {
        Logger.d(TAG, "provideHeater()")
        return Heater()
    }

    @Provides
    fun provideCoffeeBean(): CoffeeBean {
        Logger.d(TAG, "provideCoffeeBean()")
        return CoffeeBean()
    }
}