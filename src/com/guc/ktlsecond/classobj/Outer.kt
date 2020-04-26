package com.guc.ktlsecond.classobj

class Outer constructor() {
    private val bar: Int = 1;
    var v = "成员属性"

    var name: (Int, String) -> String = { id, name -> "$id,$name" }
    var param1: Int = 0
    var param2: String = "noname"

    constructor(param1: Int, param2: String, name: ((Int, String) -> String)?) : this() {
        this.name = name ?: this.name  //保留默认处理
        this.param1 = param1
        this.param2 = param2
    }

    //嵌套类   调用格式：外部类.嵌套类.嵌套类方法/属性
    class Nested {
        fun foo(): Int {
            println("foo() in Nested")
            return 2
        };
    }

    //内部类 内部类会带有一个对外部类的对象的引用
    inner class Inner {
        fun foo() = bar;
        fun innerTest() {
            var o = this@Outer //获取外部成员变量
            println("${o.bar}  ${o.v}")
            println(o.name(o.param1, o.param2))
        }
    }
}