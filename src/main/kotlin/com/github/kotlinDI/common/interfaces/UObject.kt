package com.github.kotlinDI.common.interfaces

import com.github.kotlinDI.common.errors.ObjectSetError
import kotlin.jvm.Throws

interface UObject : IObject {

    @Throws(ObjectSetError::class)
    operator fun set(key: String, value: Any)
}