package com.github.kotlin_di.common.command

class CommandExecutionError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)
