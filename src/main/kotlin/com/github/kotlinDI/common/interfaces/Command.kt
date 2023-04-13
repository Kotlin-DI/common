package com.github.kotlinDI.common.interfaces

import com.github.kotlinDI.common.errors.CommandExecutionError

fun interface Command : () -> Unit {
    @Throws(CommandExecutionError::class)
    override fun invoke()
}