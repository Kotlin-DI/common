package com.github.kotlin_di.common.interfaces

interface Usable {
    fun <R> use(block: (Usable) -> R): R
}
