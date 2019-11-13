package com.guc.ktl.entrust

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * 类委托
 * 通过关键字 by 建立委托类
 */
class Derived(b: Base) : Base by b {
    // 定义包含属性委托的类
    var p: String by Delegate()

    //延迟属性 Lazy
    val lazyValue: String by lazy {
        println("computed!")     // 第一次调用 get()输出，第二次调用不执行
        "Hello"
    }
    //可观察属性 Observable
    var observableValue: String by Delegates.observable("defaultValue") { kProperty: KProperty<*>, old: String, new: String ->
        println("旧值：$old -> 新值：$new")
    }
    //notNull 适用于那些无法在初始化阶段就确定属性值的场合
    //注意：如果属性在赋值前就被访问的话则会抛出异常
    var notNullBar: String by Delegates.notNull<String>()
}