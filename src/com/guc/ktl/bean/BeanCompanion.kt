package com.guc.ktl.bean

/**
 * z
 * 一个类里面只能声明一个内部关联对象，即关键字 companion 只能使用一次
 */
class BeanCompanion {
    // 伴生对象
    // 类内部的对象声明可以用 companion 关键字标记
    companion object {
        val field1 :Int = 1
        var field2:String = "this is filed2"
        fun function1(){
            println("this is function1")
            functionExtend()
        }

        fun function2(){
            println("this is function2")
            function1()
        }
    }

    //类内扩展的伴随对象函数只能被类内的函数引用，不能被类外的函数和伴随对象内的函数引用
    fun BeanCompanion.Companion.functionExtend(){
        println("this is functionExtendIn")
    }

    fun function3(){
        println("this is function3 in BeanCompanion")
        //对于类内其它成员函数来说，类内扩展屏蔽类外扩展
        functionExtend()
    }
}
//类外扩展的伴随对象函数可以被伴随对象内的函数引用
fun BeanCompanion.Companion.functionExtend(){
    println("this is functionExtendOut")
}
