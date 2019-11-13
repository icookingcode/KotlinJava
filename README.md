# KotlinJava
Kotlin 语法学习
## 程序入口
```
fun main(){
    println("HelloWorld");
}
```
## 数据类型
### 基本数据类型：  
Double Float Long Int Short Byte  
### 比较连个数字：  
=== 数值相等，地址相同  
== 数值相等
### 类型转换
toByte() ... toDouble()
### 字符
```
//字符转为相应的数字0-9
fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}
```
### 数组
```
两种方式：
val a = arrayOf(1, 2, 3)
val b = Array(3,{i -> (i*2)})
```
## 函数
```
//连个Int参数 返回Int类型的函数
fun sum(a:Int,b:Int):Int{
    return a+b
}
```
```
//自动推导返回值类型
fun sum(a: Int ,b: Int) = a + b
```
```
//返回无意义的值（无返回值）
fun printSum(int: Int, b: Int):Unit{
    println("sum of $a and $b is ${a + b}")
}
```
## 变量
```
val PI = 3.14  //常量 自动推断类型
val a:Int = 1 //val 只读变量，常量

var x = 5 //自动推断出'Int' 类型
x +=1 // var 可变变量
```
## 条件表达式
```
 fun maxOf(a: Int, b: Int) = if (a > b) a else b
 
 if(condition){
    ...
 }else{
    ...
 }
```
## 空值与null检测
```
//当某个变量可以为null的时候，必须在声明处的类型后添加 ？来标识该引用可以为空 
fun parseInt(str:String):Int?{ //如果str的内容不是数字返回null
    //...
}
```
## 类型检测 is 关键字
用法： is  !is  
```
val obj:Object = 5
if(obj is String){  //检测类型是否是String
    //....
}else{
    
}
```
## for 循环
```
val items = listOf("apple","banana","kiwifruit")
for(item in items){ //遍历对象
    println(item)
}
```
```
val items = listOf("apple","banana","kiwifruit")
for(index in items.indices){ //遍历index
    println("item at $index is ${items[index]}")
}
```

## while 循环
```
val items = listOf("apple","banana","kiwifruit")
var index = 0;
while(index <items.size){
    println("item at $index is ${items[index]}")
    index++
}
```
## when 表达式 （条件选择）
```
fun describe(obj:Any):String = 
    when(obj){
        1 -> "One"
        "Hello" ->"Greeting"
        is Long -> "Long"
        !is String ->"Not a String"
        else ->"Unknown"
    }
```
## 使用区间（range）
in .. 检测在区间内  
```
val x = 10
val y = 9
if(x in 1..y+1){
    println("fits in range")
}
```
!in .. 检测在指定区间外 
```
val list = listOf("a", "b", "c")
if (-1 !in 0..list.lastIndex) {
    println("-1 is out of range")
}
```
针对for循环的区间迭代
```
for(x in 1..5){ //遍历1-5
    print(x)
}
//..增加
for(x in 0..10 step 2){ //数列迭代 步长2
    print(x)
}
//downTo 减小
for(x in 9 downTo 0 step 3){
    print(x)
}

```
## Collections 
使用lambda表达式来过滤（filter）与映射（map）集合  
```
val fruits = listOf("banana","avocado","apple","kiwifruit")
fruits
    .filter{ it.startsWith("a")}
    .sortedBy{it}
    .map{it.toUpperCase()}
    .forEach{println(it)}
```
## 类和继承
```
类的修饰符
类属性修饰符：
abstract    // 抽象类  
final       // 类不可继承，默认属性
enum        // 枚举类
open        // 类可继承，类默认是final的
annotation  // 注解类
访问权限修饰符
private    // 仅在同一个文件中可见
protected  // 同一个文件中或子类可见
public     // 所有调用的地方都可见
internal   // 同一个模块中可见
```
## 接口
```
可包含：
抽象的属性：  var name:String
未实现方法：  fun f()
已实现方法：  fun f(){
                   ...
              }
              
实现接口必须实现：
抽象的属性：  override var name: String = ""
未实现方法：  override fun f() {
                // 方法体
              }
```
## 扩展
```
1.扩展函数：不对原类做修改
fun receiverType.functionName(params){
    body
}
注：receiverType:待扩展的对象
    functionName:扩展函数的名称
    params:参数
2.扩展属性：
val <T> List<T>.lastIndex: Int
    get() = size - 1
注：扩展属性只能被声明为val
3.扩展声明为成员
注：在一个类内部你可以为另一个类声明扩展
```
## 数据类和密封类
数据类 关键字：data  
使用见：DataClass    

密封类 关键字：sealed  
## 泛型
```
泛型类：    class ClassName<T>(t: T) {
                var value = t
                //body
            }
泛型函数：  fun <T> funName(value: T){
                //方法体
            }
星号投射：  eg: ArrayList<*> 任何类型的数组
            * == Any?
```
## 枚举类
```
EnumClass.valueOf(value: String): EnumClass  // 转换指定 name 为枚举值，若未匹配成功，会抛出IllegalArgumentException
EnumClass.values(): Array<EnumClass>        // 以数组的形式，返回枚举值

默认名称为枚举字符名，值从0开始。若需要指定值，则可以使用其构造函数
val name: String //获取枚举名称
val ordinal: Int //获取枚举值在所有枚举数组中定义的顺序
```
## 对象表达式和对象声明
```
对象可以继承于某个基类，或者实现其他接口
open class A(x: Int) {
    public open val y: Int = x
}
interface B {……}
val ab: A = object : A(1), B {
    override val y = 15
}

匿名对象可以用作只在本地和私有作用域中声明的类型
在对象表达中可以方便的访问到作用域中的其他变量
对象声明在另一个类的内部时，这个对象并不能通过外部类的实例访问到该对象，而只能通过类名来访问
```
## 委托
```
Kotlin 通过关键字 by 实现委托
类委托：
类的委托即一个类中定义的方法实际是调用另一个类的对象的方法来实现的
属性委托：
val/var <属性名>: <类型> by <表达式>
注：
var/val：属性类型(可变/只读)
属性名：属性名称
类型：属性的数据类型
表达式：委托代理类

```