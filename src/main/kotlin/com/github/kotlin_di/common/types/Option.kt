package com.github.kotlin_di.common.types

sealed interface Option<out T : Any>

data class Some<out T : Any>(val value: T) : Option<T>

class None<out T : Any> : Option<T>
