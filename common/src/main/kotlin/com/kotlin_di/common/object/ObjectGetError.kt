package com.kotlin_di.common.`object`

class ObjectGetError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)
