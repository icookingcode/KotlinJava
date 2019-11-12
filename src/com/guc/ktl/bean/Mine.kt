package com.guc.ktl.bean

import com.guc.ktl.interf.MyInterface

class Mine : MyInterface {
    override var name: String = "mine"
    override fun bar() {
        println("Mine中实现bar()")
    }
}