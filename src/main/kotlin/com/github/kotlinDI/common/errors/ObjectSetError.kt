package com.github.kotlinDI.common.errors

class ObjectSetError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)