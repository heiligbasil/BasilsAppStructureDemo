package com.lambdaschool.basilsappstructuredemo.application

import android.app.Application
import com.lambdaschool.basilsappstructuredemo.model.Order

class StructureApplication : Application() {

    val appOrder = Order(customerFirstName = "Demo Application")

    override fun onCreate() {
        super.onCreate()
    }
}