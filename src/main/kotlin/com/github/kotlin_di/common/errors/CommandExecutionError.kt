package com.github.kotlin_di.common.errors

class CommandExecutionError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)