package com.guc.ktl.bean

/**
 * 密封类 关键字 sealed
 * 密封类可以有子类，但是所有的子类都必须要内嵌在密封类中
 * sealed 不能修饰 interface ,abstract class(会报 warning,但是不会出现编译错误)
 * 使用密封类的关键好处在于使用 when 表达式 的时候，如果能够 验证语句覆盖了所有情况，就不需要为该语句再添加一个 else 子句了
 */
sealed class SealedClass {
}

class Case1:SealedClass(){
    fun printCase(){
        println("case1")
    }
}
class Case2(val name:String):SealedClass(){
    fun printCase2(){
        println("case2$name")
    }
}