package com.github.kotlin_di.common.`object`

import kotlin.jvm.Throws

interface UObject : IObject {

    @Throws(ObjectSetError::class)
    operator fun set(key: String, value: Any)
}
