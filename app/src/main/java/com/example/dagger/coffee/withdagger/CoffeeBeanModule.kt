package com.example.dagger.coffee.withdagger

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class CoffeeBeanModule {

//    @Binds
//    abstract fun provideCoffeeBean(ethiopiaBean: EthiopiaBean): CoffeeBean

    @Binds
    @IntoMap
    @StringKey("ethiopia")
    abstract fun provideEthiopiaBean(ethiopiaBean: EthiopiaBean): CoffeeBean

    @Binds
    @IntoMap
    @StringKey("guatemala")
    abstract fun provideGuatemalaBean(guatemalaBean: GuatemalaBean): CoffeeBean
}