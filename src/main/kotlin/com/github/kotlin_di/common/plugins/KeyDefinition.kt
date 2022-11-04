package com.github.kotlin_di.common.plugins

import com.github.kotlin_di.common.types.Key

interface KeyDefinition {
    val version: String

    fun keys(): List<Key<*, *>>
}
