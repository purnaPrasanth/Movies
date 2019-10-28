package com.purnaprasanth.baseandroid

import android.app.Application

/**
 * Base Class For App Initializer
 */

interface AppInitializer {
    fun init(application: Application)
}