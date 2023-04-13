package com.github.kotlinDI.common.plugins

import com.github.kotlinDI.common.errors.PluginLoadError
import kotlin.jvm.Throws

interface IPlugin {
    val version: String

    @Throws(PluginLoadError::class)
    fun load()
}