package com.github.kotlin_di.common.validation

class ValidationError(
    private val msg: String,
    val errors: Collection<ValidationError> = listOf()
) : Error(msg)
