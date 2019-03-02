package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger

class CafeInfo {

    companion object {
        private const val TAG = "CafeInfo"
    }

    private lateinit var name: String

    init {
        Logger.d(TAG, "CafeInfo() created")
    }

    constructor() {

    }

    constructor(name: String) {
        this.name = name
    }

    fun welcome() {
        Logger.d(TAG, "Welcome $name")
    }
}