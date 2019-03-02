package com.example.dagger.coffee.withdagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CoffeeComponent::class])
class CafeModule {

    private var name: String? = null

    constructor() {

    }

    constructor(name: String) {
        this.name = name
    }

    @Singleton
    @Provides
    fun cafeInfo(): CafeInfo {
        return if (name.isNullOrEmpty()) CafeInfo()
        else CafeInfo(name!!)
    }
}