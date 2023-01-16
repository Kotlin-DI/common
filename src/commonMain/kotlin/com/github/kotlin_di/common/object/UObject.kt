package com.github.kotlin_di.common.`object`

interface UObject : IObject {

    @Throws(ObjectSetError::class)
    operator fun set(key: String, value: Any)
}
