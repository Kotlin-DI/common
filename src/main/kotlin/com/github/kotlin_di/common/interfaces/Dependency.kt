package com.github.kotlin_di.common.interfaces

import com.github.kotlin_di.common.errors.ResolveDependencyError
import kotlin.jvm.Throws

fun interface Dependency<P, R> : (P) -> R {
    @Throws(ResolveDependencyError::class)
    override fun invoke(args: P): R
}
