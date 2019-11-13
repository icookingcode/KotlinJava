package com.guc.ktl.`object`

/**
 * 对象声明 关键字：object
 *
 */
object ConditionControl{

    fun testWhen(x:Int){
        //相当于switch
        when(x){
            1-> println("x == 1")
            2-> println("x == 2")
            else ->{
                println("x!=1,x!=2")
            }
        }
        var y = x%2;
        //相当于if else if
        when{
            y == 0 -> println("x is even(偶数)")
            y == 1 -> println("x is odd(奇数)")
            else -> println("x is funny")
        }
    }

    /**
     * 测试for循环
     */
    fun testFor(){
        val items = listOf("apple", "banana", "kiwi")
        for (item in items){
            println(item)
        }
        for(index in items.indices){
            println("item at $index is ${items[index]}")
        }
    }

    //测试标签
    fun testLabel(){
        loop@ for (i in 1..4) {
            for (j in 1..4) {
                if (i == 2 && j==2){
                    break@loop;
                }
                println("i = $i,j = $j")
            }
        }
    }
}