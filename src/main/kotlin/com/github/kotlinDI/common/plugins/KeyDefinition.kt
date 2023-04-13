package com.github.kotlinDI.common.plugins

import com.github.kotlinDI.common.types.Key

interface KeyDefinition {
    val version: String

    fun keys(): List<Key<*, *>>
}