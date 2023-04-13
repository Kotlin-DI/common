package com.github.kotlinDI.common.errors

class CommandExecutionError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)