package com.github.kotlinDI.common.interfaces

import com.github.kotlinDI.common.errors.ResolveDependencyError
import kotlin.jvm.Throws

fun interface Dependency<P, R> : (P) -> R {
    @Throws(ResolveDependencyError::class)
    override fun invoke(args: P): R
}