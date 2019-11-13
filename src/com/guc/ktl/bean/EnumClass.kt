package com.guc.ktl.bean

/**
 * 枚举类 关键字：enum
 */
enum class EnumClass {
    RED, BLACK, BLUE, GREEN, WHITE
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/**
 * 默认名称为枚举字符名，值从0开始。若需要指定值，则可以使用其构造函数
 */
enum class Shape(value: Int) {
    ovel(100),
    rectangle(200)
}
