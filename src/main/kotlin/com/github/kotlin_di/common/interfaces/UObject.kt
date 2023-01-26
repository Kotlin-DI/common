package com.github.kotlin_di.common.interfaces

import com.github.kotlin_di.common.errors.ObjectSetError
import kotlin.jvm.Throws

interface UObject : IObject {

    @Throws(ObjectSetError::class)
    operator fun set(key: String, value: Any)
}
