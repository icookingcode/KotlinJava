package com.guc.ktlsecond.classobj

import java.util.*

/**
 * 泛型类
 */
class Box<T>(t:T) {
    val value = t;
}

//泛型方法
fun <T> boxIn(t:T) = Box(t)

//泛型约束
fun <T:Comparable<T>> sort(list:List<T>)= Collections.sort(list)

fun <T:Comparable<T>> sort(list:List<T>,cp:Comparator<T> = kotlin.Comparator { o1, o2 ->o1.compareTo(o2)  })= Collections.sort(list,cp)

/**
 * 声明处的类型变异使用协变注解修饰符：in、out，消费者 in, 生产者 out
 */
class Guc<out A,in B> (private val a:A,b: B){

    //使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型
    fun funA():A {
        println("funA in Guc:$a")
        return a
    }

    //in 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型
    fun funB(b: B){
      println("funB in Guc:$b")
    }
}