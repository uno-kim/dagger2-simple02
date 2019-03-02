package com.example.dagger.coffee.withdagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CafeModule::class])
interface CafeComponent {

    //provision method
    fun cafeInfo(): CafeInfo

    fun coffeeComponent(): CoffeeComponent.Builder
}