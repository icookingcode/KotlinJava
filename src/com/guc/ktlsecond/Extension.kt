package com.guc.ktlsecond

//往已有类中添加方法

/**
 * 交换下标数据
 */
fun <E> MutableList<E>.swap(index1: Int, index2: Int) {
    val tmp = this[index1];
    this[index1] = this[index2]
    this[index2] = tmp
}

/**
 * toString  若为null 返回 null
 */
fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}

/**
 * 对属性进行扩展
 * 只能由显式提供的 getter/setter 定义。
 */
val <T> List<T>.lastIndex: Int
    get() = size - 1