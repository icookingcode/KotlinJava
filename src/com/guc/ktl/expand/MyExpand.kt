package com.guc.ktl.expand

import com.guc.ktl.bean.Base
import com.guc.ktl.bean.Person

/**
 * 调换不同位置的值
 */
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}
//扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数
fun Base.foo()="base.foo()"
fun Person.foo()="person.foo()"

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}
//扩展属性
val <T> List<T>.lastIndex: Int
    get() = size - 1