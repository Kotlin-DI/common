package com.github.kotlinDI.common.errors

class ObjectGetError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)