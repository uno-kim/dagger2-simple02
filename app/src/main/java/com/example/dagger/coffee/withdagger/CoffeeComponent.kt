package com.example.dagger.coffee.withdagger

import dagger.Subcomponent

@CoffeeScope
@Subcomponent(modules = [CoffeeModule::class])
interface CoffeeComponent {

    //provision method
    fun coffeeMaker(): CoffeeMaker

    fun coffeeBean(): CoffeeBean

    @Subcomponent.Builder
    interface Builder {
        fun build(): CoffeeComponent
    }
}