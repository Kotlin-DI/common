package com.github.kotlinDI.common.interfaces

import java.io.Closeable

interface Usable : Closeable {
    fun <R> use(block: (Usable) -> R): R
}