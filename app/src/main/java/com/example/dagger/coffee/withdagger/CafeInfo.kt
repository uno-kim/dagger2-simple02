package com.example.dagger.coffee.withdagger

import com.example.dagger.logger.Logger

class CafeInfo {

    companion object {
        private const val TAG = "CafeInfo"
    }

    private val name: String?

    constructor() {
        this.name = null
        Logger.d(TAG, "CafeInfo() created")
    }

    constructor(name: String) {
        this.name = name
        Logger.d(TAG, "CafeInfo($name) created")
    }

    fun welcome() {
        Logger.d(TAG, "Welcome $name")
    }
}