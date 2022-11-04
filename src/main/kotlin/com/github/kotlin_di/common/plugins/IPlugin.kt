package com.github.kotlin_di.common.plugins

import kotlin.jvm.Throws

interface IPlugin<Keys : KeyDefinition> {
    val version: String

    @Throws(PluginLoadError::class)
    fun load()
}
