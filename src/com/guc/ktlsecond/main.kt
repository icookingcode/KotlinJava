package com.guc.ktlsecond

import com.guc.ktl.bean.Shape
import com.guc.ktl.testEntrust
import com.guc.ktlsecond.basic.*
import com.guc.ktlsecond.classobj.*


val sumLambda: (Int, Int) -> Int = { x, y -> x + y }//lambda 匿名函数 函数也是变量
/**
 * 第二遍学习
 */
fun main(args: Array<String>) {
    println("hello world")
    testBasic()
    testClassAndObject()
    testDataClass2()
    testEnum2()
    testObjExp()
    testEntrust()
}

fun testObjExp() {
    println("----------对象表达式------------")
    val csdn = object {
        val name:String = "guc的csdn"
        val site:String = "https://blog.csdn.net/qq_31028313"
    }
    println("${csdn.name}:${csdn.site}")
    val objExp = ObjExp()
    objExp.bar()
    val obj = objExp.publicFoo()

}

fun testEnum2() {
    println("----------枚举------------")
    val shape = Shape.ovel
    println("${shape.name}: ${shape.ordinal} : ${shape.value}")
}

fun testDataClass2() {
    println("----------数据类------------")
    val jack = User("Jack",45)
    val lily = jack.copy(name = "Lily",age = 29)
    println(jack)
    println(lily)

    println("----------泛型------------")
    val box1 = Box(1)
    val box2 = Box("guchao")
    val box3 = Box(3.1415926)
    println("${box1.value}  ${box2.value}  ${box3.value}")
    val box4 = boxIn(true)
    val box5 = boxIn(18L)
    println("${box4.value}  ${box5.value}")
    var list = mutableListOf(1,3,2,4)
    println("排序前：$list")
    sort(list)
    println("排序后：$list")
    sort(list,cp = Comparator { o1, o2 -> o2-o1 } )
    println("排序后：$list")

    val guc = Guc("hello","world")
    guc.funA()
    guc.funB("world")

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

