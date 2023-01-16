package com.github.kotlin_di.common.`object`

class ObjectSetError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)
