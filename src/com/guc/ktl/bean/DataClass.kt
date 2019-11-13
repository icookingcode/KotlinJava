package com.guc.ktl.bean

import com.guc.ktl.interf.MyInterface

/**
 * 数据类  关键字 data
 *  主构造函数至少包含一个参数
 *  所有的主构造函数的参数必须标识为val 或者 var
 *  数据类不可以声明为 abstract, open, sealed 或者 inner
 *  数据类不能继承其他类 (但是可以实现接口)
 *
 *  组件函数允许数据类在解构声明中使用
 */
data class DataClass (val value1:String,var value2:String):MyInterface{
    override var name: String = "dataClass"

    override fun bar() {
        println("bar() in $name")
    }
    fun copy(name: String = this.name,value1: String = this.value1,value2: String=this.value2):DataClass {
        var copy = DataClass(value1,value2)
        copy.name = name
        return copy
    }

}