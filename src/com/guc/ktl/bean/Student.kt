package com.guc.ktl.bean

class Student:Person() {
    override fun eat() {
        super.eat()
        println("Student eat more food")
    }
    fun study(){
        println("Student study")
    }
}