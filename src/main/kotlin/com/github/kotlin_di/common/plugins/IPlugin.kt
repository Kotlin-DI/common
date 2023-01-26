package com.github.kotlin_di.common.plugins

import com.github.kotlin_di.common.errors.PluginLoadError
import kotlin.jvm.Throws

interface IPlugin {
    val version: String

    @Throws(PluginLoadError::class)
    fun load()
}
