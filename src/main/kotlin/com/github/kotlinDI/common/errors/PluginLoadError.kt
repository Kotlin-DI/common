package com.github.kotlinDI.common.errors

import com.github.kotlinDI.common.plugins.IPlugin

class PluginLoadError(
    val plugin: IPlugin,
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)