package com.guc.ktl.bean

class User constructor(name: String){
    init {
        println("初始化名: $name")
    }
    constructor(name: String,age:Int) : this(name) {
        this.name = name
        this.age = age
    }
    var name:String = name
            get() = field.toUpperCase()
    var age:Int = 29
            set(value) {
                if (value>120){
                    field = -1;
                }else{
                    field = value
                }
            }

    override fun toString(): String {
        return name+"年龄："+age
    }

    //嵌套类
    class Study{
        fun print(){
            println("这是嵌套类中打印的")
        }
    }

    /**
     * 嵌套内部类类
     * 必须创建外部类对象才能创建
     * 可以获取到外部类对象
     */
    inner class Hobby{
        fun print(){
            println("这是嵌套内部类中打印的 ${this@User.name}")
        }
    }
}
/**扩展函数**/
fun User.Print(){
    println("扩展函数中"+ toString())
}