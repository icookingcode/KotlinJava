package com.guc.ktl

import com.guc.ktl.`object`.ConditionControl
import com.guc.ktl.`object`.Site
import com.guc.ktl.bean.*
import com.guc.ktl.entrust.BaseImpl
import com.guc.ktl.entrust.BlueToothImpl
import com.guc.ktl.entrust.Derived
import com.guc.ktl.entrust.MySite
import com.guc.ktl.exp.IllegalAgeException
import com.guc.ktl.expand.foo
import com.guc.ktl.expand.swap

fun main(args:Array<String>){
    println("Hello World")
    val a:Int? = sum(5,2);
    if (a==null){
        println("a=null")
    }else{
        println("5+2= $a")
    }
    vars(1,3,5,7)
    testNull()
    testRange()
    testString()
    ConditionControl.testWhen(1)
    ConditionControl.testFor()
    ConditionControl.testLabel()
    val user = User("Andy", 30)
    try {
        val user2 = User("Guc", 130)
    } catch (e: IllegalAgeException) {
        println(e.message)
    }
    println(user.toString())
    user.Print()
    User.Study().print()
    user.Hobby().print()
    var person = Person();
    person.eat()
    var monkey = Monkey();
    monkey.eat()
    var student = Student();
    student.eat()
    student.study()
    var mine = Mine()
    mine.bar()
    mine.foo()
    println(mine.name)
    println("++++++++++++++扩展函数使用++++++++++++++++")
    testExtendFun(person)
    println("++++++++++++++数据类++++++++++++++++")
    testDataClass()
    println("++++++++++++++密封类++++++++++++++++")
    testSealedClass()
    println("++++++++++++++泛型++++++++++++++++")
    testCommon()
    println("++++++++++++++枚举++++++++++++++++")
    testEnum()
    println("++++++++++++++对象表达式++++++++++++++++")
    testObjectExp()
    println("++++++++++++++委托++++++++++++++++")
    testEntrust()
}

//测试委托
fun testEntrust() {
    var b = BaseImpl(20)
    var c = BlueToothImpl(20)
    Derived(b).print()
    Derived(c).print()
    println()
    val derived = Derived(b)
    println(derived.p)
    derived.p = "HelloWorld"
    println(derived.p)
    println("++++++++++++++延时属性++++++++++++++++")
    println(derived.lazyValue)
    println(derived.lazyValue)
    println("++++++++++++++可观察属性++++++++++++++++")
    derived.observableValue = "第一次赋值"
    derived.observableValue = "第二次赋值"
    println(derived.observableValue)
    println("++++++++++++++把属性存放在映射中++++++++++++++++")
    val mySite = MySite(mapOf("name" to "百度", "url" to "www.baidu.com"))
    println("${mySite.name} : ${mySite.url}")
}

//对象表达式
fun testObjectExp() {
    //匿名对象可以用作只在本地和私有作用域中声明的类型
    val site = object {
        var name: String = "菜鸟教程"
        var url: String = "www.runoob.com"
        override fun toString(): String {
            return "$name  $url"
        }
    }
    println(site.toString())
    val site1 = Site
    val site2 = Site
    site1.url = "www.baidu.com"
    println("site1.url ${site1.url}")
    println("site2.url ${site2.url}")
}

//扩展
fun testExtendFun(person: Person) {
    val l = mutableListOf<Int>(1, 2, 3)
    println("调换前 ${l.toString()}")
    l.swap(0, 2)
    println("调换后 ${l.toString()}")
    printFoo(person)
    BeanCompanion.function1()
    BeanCompanion().function3()
}

//枚举测试
fun testEnum() {
    val color = EnumClass.BLUE
    println("name:${color.name}   ordinal:${color.ordinal}")
    val color2 = Color.valueOf("RED")
    val color3 = Color.values()[1]
    println("name:${color2.name}  ordinal:${color2.ordinal}")
    println("name:${color3.name}  ordinal:${color3.ordinal}")
}

//泛型使用
fun testCommon() {
    val common = Common(10)
    val common2 = Common("字符串")
    val common3 = Common(23.1)
    common.printValue()
    common2.printValue()
    common3.printValue()
}

//测试密封类
fun testSealedClass() {
    val case:SealedClass = Case1()
    when(case){
        is Case1 -> case.printCase()
        is Case2 -> case.printCase2()
    }
}

//测试数据类
fun testDataClass() {
    val dataClass= DataClass("guc","chao")
    val dataClass2 = dataClass.copy("dataClass2","chen","xueli")
    val dataClass3= dataClass.copy()
    dataClass.bar()
    dataClass2.bar()
    dataClass3.bar()
    println(dataClass)
    println(dataClass2)
    println(dataClass3)
    //组件函数允许数据类在解构声明中使用
    val (value1,value2) = dataClass
    println("$value1,$value2")
}

fun sum(a:Int,b:Int):Int?{
    return a+b
}
//变长参数
fun vars(vararg v:Int){
    for (vt in v){
        print(vt)
    }
    println()
}
//NULL检查机制
fun testNull(){
    var age:String?=null
    //  val ages = age!!.toInt();//抛出空指针异常
//    val ages = age?.toInt();//不做处理返回null
    val ages = age?.toInt()?:-1//配合?:做空判断处理
    println(ages)
}
//区间
fun testRange(){
    println("区间")
    for (i in 1..10){
        print(i)
    }
    println()
    for(i in 10 downTo 0 step 2){
        print(i)
    }
    println()
}
//测试字符串
fun testString() {
    val str = "Hello";
    for (c in str){
        print(c)
    }
    println()
}
fun printFoo(base: Base){
    println(base.foo())//类型是Base类
}