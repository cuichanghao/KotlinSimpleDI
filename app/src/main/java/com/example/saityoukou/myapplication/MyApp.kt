package com.example.saityoukou.myapplication

import android.app.Application

/**
 * Created by cuichanghao007 on 2017/08/18.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        isMock = true
    }
}