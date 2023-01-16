package com.github.kotlin_di.common.plugins

interface IPlugin<Keys : KeyDefinition> {
    val version: String

    @Throws(PluginLoadError::class)
    fun load()
}
