package com.example.saityoukou.myapplication.inside

import com.example.saityoukou.myapplication.getParamRepo
import com.example.saityoukou.myapplication.loginRepo

/**
 * Created by cuichanghao007 on 2017/08/18.
 */
class MyRepo {

    fun testFun(){
        loginRepo.method1()
        getParamRepo()
    }
}