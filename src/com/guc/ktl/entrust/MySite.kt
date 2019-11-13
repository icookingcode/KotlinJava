package com.guc.ktl.entrust

/**
 * 把属性储存在映射中
 */
class MySite(val map: Map<String, Any?>) {
    val name: String by map
    val url: String by map
}