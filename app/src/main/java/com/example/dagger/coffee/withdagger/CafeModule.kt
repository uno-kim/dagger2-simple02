package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CoffeeComponent::class])
class CafeModule {

    companion object {
        private const val TAG = "CafeModule"
    }

    private val name: String?

    constructor() {
        this.name = null
        Logger.d(TAG, "CafeModule() created")
    }

    constructor(name: String) {
        this.name = name
        Logger.d(TAG, "CafeModule($name) created")
    }

    @Singleton
    @Provides
    fun provideCafeInfo(): CafeInfo {
        Logger.d(TAG, "provideCafeInfo()")

        return if (name.isNullOrEmpty()) {
            CafeInfo()
        } else {
            CafeInfo(name)
        }
    }

//    @Provides
//    fun provideCoffeeMaker(heater: Heater): CoffeeMaker {
//        Logger.d(TAG, "provideCoffeeMaker()")
//        return CoffeeMaker(heater)
//    }

//    @Provides
//    fun provideHeater(): Heater {
//        Logger.d(TAG, "provideHeater()")
//        return Heater()
//    }

}