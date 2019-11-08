package com.guc.ktl

import com.guc.ktl.bean.Monkey
import com.guc.ktl.bean.Person
import com.guc.ktl.bean.Student
import com.guc.ktl.bean.User

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
    println(user.toString())
    User.Study().print()
    user.Hobby().print()
    var person = Person();
    person.eat()
    var monkey = Monkey();
    monkey.eat()
    var student = Student();
    student.eat()
    student.study()

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