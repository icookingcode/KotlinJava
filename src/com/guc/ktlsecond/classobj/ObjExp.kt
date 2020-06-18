package com.guc.ktlsecond.classobj

/**
 * 对象表达式
 * 匿名对象可以用作只在本地和私有作用域中声明的类型
 */
class ObjExp {

    // 私有函数，所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "x"
    }

    // 公有函数，所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar(){
        println("${foo().x}")
        println("${publicFoo()}")
    }

}
