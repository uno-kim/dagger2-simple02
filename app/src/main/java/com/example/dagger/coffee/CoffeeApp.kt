package com.example.dagger.coffee

import com.example.dagger.coffee.withdagger.*
import com.example.dagger.logger.Logger

class CoffeeApp {

    companion object {
        private const val TAG = "CoffeeApp"
    }

    fun run() {
        // Scope
        val cafeComponent = DaggerCafeComponent.create()
        val cafeInfo1: CafeInfo = cafeComponent.cafeInfo()
        val cafeInfo2: CafeInfo = cafeComponent.cafeInfo()
        Logger.d(TAG, "Singleton scope CafeInfo is equal : ${cafeInfo1 == cafeInfo2}")

        // CoffeeScope
        val coffeeComponent1: CoffeeComponent = cafeComponent.coffeeComponent().build()
        val coffeeMaker1: CoffeeMaker = coffeeComponent1.coffeeMaker()
        val coffeeMaker2: CoffeeMaker = coffeeComponent1.coffeeMaker()
        Logger.d(TAG, "Maker scope / same component coffeeMaker is equal : ${coffeeMaker1 == coffeeMaker2}")

        val coffeeComponent2: CoffeeComponent = cafeComponent.coffeeComponent().build()
        val coffeeMaker3: CoffeeMaker = coffeeComponent2.coffeeMaker()
        Logger.d(TAG, "Maker scope / different component coffeeMaker is equal : ${coffeeMaker1 == coffeeMaker3}")

        // Non-scope
        val coffeeBean1: CoffeeBean = coffeeComponent1.coffeeBean()
        val coffeeBean2: CoffeeBean = coffeeComponent1.coffeeBean()
        Logger.d(TAG, "Non-scoped coffeeBean is equal :${coffeeBean1 == coffeeBean2}")

        //
        val cafeComponent2: CafeComponent = DaggerCafeComponent.builder().cafeModule(CafeModule("example cafe")).build()
        cafeComponent2.cafeInfo().welcome()

        val coffeeComponent: CoffeeComponent = DaggerCafeComponent.create().coffeeComponent().build()
        coffeeComponent.coffeeBeanMap()["guatemala"]?.name()
    }
}