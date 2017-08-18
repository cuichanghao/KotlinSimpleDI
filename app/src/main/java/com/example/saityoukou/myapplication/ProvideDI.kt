package com.example.saityoukou.myapplication

/**
 * Created by cuichanghao007 on 2017/08/18.
 */

//private method 1: package level
var isMock = false
val loginRepo by lazy { if(isMock) LoginRepoMock else LoginRepo }
fun getParamRepo() = if(isMock) ParamsRepoMock() else ParamsRepo()

//private method 2: check flag
//object ProvideDI {
//    var isMock = false
//    val loginRepo by lazy { if(isMock) LoginRepoMock else LoginRepo }
//}

//private method 3: separate class
//object Provide {
//    val loginRepo by lazy { LoginRepo }
//}
//
//object ProvideMock {
//    val loginRepo by lazy { LoginRepoMock }
//}