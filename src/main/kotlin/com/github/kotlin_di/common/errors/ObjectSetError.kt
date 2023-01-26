package com.github.kotlin_di.common.errors

class ObjectSetError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)
