package com.github.kotlin_di.common.`object`

interface IObject {
    @Throws(ObjectGetError::class)
    operator fun get(
        key: String,
        orElse: () -> Any = { throw ObjectGetError("key $key not found.") }
    ): Any
}
