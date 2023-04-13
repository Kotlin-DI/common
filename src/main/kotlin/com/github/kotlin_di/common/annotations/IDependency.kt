package com.github.kotlin_di.common.annotations

/** Marks class or function as Dependency definition
 * @property key name for the dependency to be registered as
 * @sample com.github.kotlin_di.common.iDependencySample
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class IDependency(val key: String)
