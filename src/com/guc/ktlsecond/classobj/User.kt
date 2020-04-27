package com.guc.ktlsecond.classobj

/**
 * equals() / hashCode()
 * toString() 格式如 "User(name=John, age=42)"
 * componentN() functions 对应于属性，按声明顺序排列
 * copy() 函数
 */
data class User(val name:String,val age:Int)