package com.example.saityoukou.myapplication

/**
 * Created by cuichanghao007 on 2017/08/18.
 */

//方法１

var isMock = false
val loginRepo by lazy { if(isMock) LoginRepoMock else LoginRepo }
fun getParamRepo() = if(isMock) ParamsRepoMock() else ParamsRepo()

//方法２
//object ProvideDI {
//    var isMock = false
//    val loginRepo by lazy { if(isMock) LoginRepoMock else LoginRepo }
//}

//方法３
//object Provide {
//    val loginRepo by lazy { LoginRepo }
//}
//
//object ProvideMock {
//    val loginRepo by lazy { LoginRepoMock }
//}