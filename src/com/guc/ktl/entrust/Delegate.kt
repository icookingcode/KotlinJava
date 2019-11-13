package com.guc.ktl.entrust

import kotlin.reflect.KProperty

class Delegate {
    var p: String = "default"
    /*
     *thisRef —— 必须与属性所有者类型（对于扩展属性——指被扩展的类型）相同或者是它的超类型
     * property —— 必须是类型 KProperty<*> 或其超类型
     */
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef,这里委托了${property.name}属性 "
        return p
    }

    /**
     * property —— 必须是类型 KProperty<*> 或其超类型
     * new value —— 必须和属性同类型或者是它的超类型
     */
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        println("$thisRef 的 ${property.name} 属性赋值为 $value")
        p = value
    }
}