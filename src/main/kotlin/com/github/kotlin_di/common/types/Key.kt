package com.github.kotlin_di.common.types

data class Key<P : Any, R : Any>(private val name: String) {
    override fun toString(): String = name
}
