package com.guc.ktlsecond.classobj

open abstract class Base {
    abstract fun f()  //无需对抽象类或抽象成员标注open注解。  open表示可被继承
    open fun openf() {
        println("openf in Base")
    }
}