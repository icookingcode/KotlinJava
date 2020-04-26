package com.guc.ktlsecond.classobj

abstract class Driver : Base() {
    abstract override fun f()

    override fun openf() {
        super.openf()
        println("openf in Driver")
    }
}