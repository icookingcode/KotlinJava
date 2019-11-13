package com.guc.ktl.bean

class Common<T>(var t:T) {
    var value = t

    fun printValue(){
        when(value){
            is Int -> println("$t is Int")
            is String -> println("$t is String")
            else -> println("$t is not Int or String type")
        }
    }
}
