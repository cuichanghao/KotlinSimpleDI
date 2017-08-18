package com.example.saityoukou.myapplication

/**
 * Created by cuichanghao007 on 2017/08/18.
 */
class LoginRepoTest {

}

interface LoginRepoInterface {
    fun method1()
    fun method2()
}

object LoginRepo:  LoginRepoInterface{
    override fun method1() {
    }

    override fun method2() {
    }
}
object LoginRepoMock:  LoginRepoInterface{
    override fun method1() {
    }

    override fun method2() {
    }

    fun method3() {
    }
}
