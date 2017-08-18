package com.example.saityoukou.myapplication

/**
 * Created by cuichanghao007 on 2017/08/18.
 */
class paramRepoTest {

}

interface ParamsRepoInterface {
    var dbName: String
    fun method1()
    fun method2()
}

class ParamsRepo:  ParamsRepoInterface{
    override var dbName = "app.db"
    override fun method1() {
    }

    override fun method2() {
    }
}
class ParamsRepoMock:  ParamsRepoInterface{
    override var dbName = "mock.db"
    override fun method1() {
    }

    override fun method2() {
    }
}
