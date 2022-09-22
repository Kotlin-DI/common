package com.github.kotlin_di.common.annotations

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class IDependency(val key: String)
