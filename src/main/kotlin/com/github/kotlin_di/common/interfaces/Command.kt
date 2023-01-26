package com.github.kotlin_di.common.interfaces

import com.github.kotlin_di.common.errors.CommandExecutionError

fun interface Command : () -> Unit {
    @Throws(CommandExecutionError::class)
    override fun invoke()
}
