package com.github.kotlin_di.common.interfaces

import com.github.kotlin_di.common.errors.ObjectGetError
import kotlin.jvm.Throws

interface IObject {
    @Throws(ObjectGetError::class)
    operator fun get(
        key: String,
        orElse: () -> Any = { throw ObjectGetError("key $key not found.") }
    ): Any
}
