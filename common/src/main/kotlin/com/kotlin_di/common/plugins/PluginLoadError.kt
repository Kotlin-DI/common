package com.kotlin_di.common.plugins

class PluginLoadError(
    override val message: String,
    override val cause: Throwable? = null
) : Error(message, cause)
