package com.github.kotlin_di.common.errors

import com.github.kotlin_di.common.plugins.IPlugin

class PluginLoadError(
    val plugin: IPlugin,
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)
