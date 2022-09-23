package com.github.kotlin_di.common.annotations

import kotlin.reflect.KClass

/** Marks class or function as Dependency definition
 * @param key name for the dependency to be registered as
 * @param returns return type of Dependency.invoke() method
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class IDependency(val key: String, val returns: KClass<out Any>)
