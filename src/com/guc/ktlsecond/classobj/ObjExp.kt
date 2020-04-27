package com.guc.ktlsecond.classobj

/**
 * 对象表达式
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
