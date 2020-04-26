package com.guc.ktlsecond.classobj

class Person constructor(id: Int) : MyBaseInterface { //constructor(id:Int) 主构造器 默认没有
    var id = id;
    //field 关键词只能用于属性的访问器
    var name: String = "Andy"
        get() = field.toUpperCase()

    var no: Int = 100
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }
    var heiht: Float = 145.4f
        private set

    init {
        println("初始化对象，创建时调用")
    }

    constructor(id: Int, name: String) : this(id) {
        println("次级构造函数")
        this.name = name;
    }

    override fun toString(): String {
        return "$id name=$name no=$no height=$heiht"
    }

    override fun bar() {
        println("bar bar bar")
    }

    override fun print() {
        println(toString())
    }

    //伴生对象
    companion object {
        var age: Int = 0;
        fun getAgeDesc(): String {
            return "${age}岁"
        }
    }


}