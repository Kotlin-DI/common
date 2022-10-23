package com.github.kotlin_di.common.types

data class DRecord<P : Any, R : Any>internal constructor(val key: String, val dependency: Dependency<P, R>)

infix fun <P : Any, R : Any> Key<P, R>.by(d: Dependency<P, R>) = DRecord(this.name, d)
infix fun <P : Any, R : Any> String.by(d: Dependency<P, R>) = DRecord(this, d)
