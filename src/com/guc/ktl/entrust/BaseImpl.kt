package com.guc.ktl.entrust

/**
 * 实现Base打印接口的被委托的类
 */
class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}