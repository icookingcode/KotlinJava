package com.guc.ktlsecond.basic

//方法定义
fun sum(a: Int, b: Int): Int {
    return a + b;
}

//可变长度参数
fun sumAll(vararg v: Int): Int {
    var r = 0;
    for (i in v) {
        r += i;
    }
    return r;
}

//Null检查机制
fun string2Int(s: String?): Int {//? 表示允许为null
//    s!!.toInt() // !! 表示不处理  抛出空指针异常
    return s?.toInt() ?: 0  //?: s=null时执行
}

//非string 类型返回null
fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length //自动类型转换
}

fun testRange() {//无参数 无返回值
    println("in 1..4")
    for (a in 1..4) {  //增大
        print("$a ")
    }
    println()
    println("a in 4 downTo 1")
    for (a in 4 downTo 1) {//减小
        print("$a ")
    }
    println()
    println("a in 1 until 4 ")
    for (a in 1 until 4) {//[1,4) 排除结束元素
        print("$a ")
    }
    println()
    println("in 1..4 step 2")
    for (a in 1..4 step 2) {  //增大
        print("$a ")
    }

}

fun testMultiLinesString() {
    val text = """
    春眠不觉晓，
    处处闻啼鸟。
    夜来风雨声，
    花落知多少。
    """
    println(text)
}

fun testArray() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item[$index] = ${items[index]}")
    }
    println()
    for ((index, value) in items.withIndex()) {
        println("item[$index] = $value")
    }
}