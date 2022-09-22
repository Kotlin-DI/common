package com.github.kotlin_di.common.annotations

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.PROPERTY)
@Repeatable()
annotation class Validate(val strategy: String, vararg val options: String)
