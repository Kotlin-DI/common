package com.github.kotlinDI.common.errors

class ResolveDependencyError(override val message: String, override val cause: Throwable? = null) : Error(
    message,
    cause
)