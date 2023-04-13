package com.github.kotlin_di.common.types

/**
 * class for type-safe storage of dependency keys
 * @param P type for arguments of the dependency
 * @param R return type of the dependency
 * @property name of the registered dependency
 * @sample com.github.kotlin_di.common.keySample
 */
data class Key<P : Any, R : Any>(private val name: String) {
    override fun toString(): String = name
}
