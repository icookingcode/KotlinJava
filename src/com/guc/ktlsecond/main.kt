package com.guc.ktlsecond

import com.guc.ktlsecond.basic.*
import com.guc.ktlsecond.classobj.Outer
import com.guc.ktlsecond.classobj.Person


val sumLambda: (Int, Int) -> Int = { x, y -> x + y }//lambda 匿名函数 函数也是变量
/**
 * 第二遍学习
 */
fun main(args: Array<String>) {
    println("hello world")
    testBasic()
    testClassAndObject()
}

fun testBasic(): Unit { //Unit可省略
    val res = sum(5, 7)
    println("5+7=$res")
    val res3 = sumLambda(4, 7)
    println("4+7=$res3")
    val res2 = sumAll(6, 7, 8, 9)
    println("6+7+8+9=$res2")
    val res4 = string2Int(null);
    val res5 = string2Int("1");
    println("null.toInt = $res4 \n \"1\".toInt = $res5")
    val res6 = getStringLength(1);
    println("1.length = $res6")
    testRange()
    testMultiLinesString()
    testArray()
}


fun testClassAndObject() {
    var person = Person(1)
    println(person)
    person.no = 35
    println(person)

    person = Person(2, "Jack")
    println(person)

    println("----------实现接口的方法------------")
    person.bar()
    person.print()

    println("----------伴生对象------------")
    Person.age = 29;
    println(Person.getAgeDesc())

    println("----------嵌套类 /内部类------------")
    var nested = Outer.Nested();//嵌套类调用
    nested.foo()

    var inner = Outer().Inner();//内部类调用
    inner.innerTest()

    var inner2 = Outer(10, "guchao") { id, name -> "$id 自定义实现 $name" }.Inner()  //lambda表达式为最后一个参数时 可移动到外部
    inner2.innerTest()
    println("----------扩展函数------------")
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list.toString())
    println(null.toString())
}

