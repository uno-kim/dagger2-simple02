package com.example.dagger.coffee.withdagger

import dagger.Subcomponent

@CoffeeScope
@Subcomponent(modules = [CoffeeModule::class, CoffeeBeanModule::class])
interface CoffeeComponent {

    //provision method
    fun coffeeMaker(): CoffeeMaker

    fun coffeeBean(): CoffeeBean

    fun coffeeBeanMap(): Map<String, CoffeeBean>

    @Subcomponent.Builder
    interface Builder {
        fun build(): CoffeeComponent
    }
}