package com.guc.ktl.exp

class IllegalAgeException(age: Int?) : Exception() {
    var age: Int? = 0;

    init {
        this.age = age
    }

    override val message: String?
        get() = "${age ?: -1}年龄不合法"
}