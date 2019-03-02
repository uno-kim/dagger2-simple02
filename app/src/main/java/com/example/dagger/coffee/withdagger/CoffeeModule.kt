package com.example.dagger.coffee.withdagger

import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {

    @CoffeeScope
    @Provides
    fun provideCoffeeMaker(heater: Heater): CoffeeMaker = CoffeeMaker(heater)

    @CoffeeScope
    @Provides
    fun provideHeater(): Heater = Heater()

    @Provides
    fun provideCoffeeBean(): CoffeeBean = CoffeeBean()
}