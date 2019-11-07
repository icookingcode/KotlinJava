package com.guc.ktl

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