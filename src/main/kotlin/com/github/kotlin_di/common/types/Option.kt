package com.github.kotlin_di.common.types

/**
 * Wrapper to specify optional parameters in a tuple, of data-class.
 * Can be used to overload generic functions.
 * @param T type of the wrapped value
 * @sample com.github.kotlin_di.common.optionSample
 */
sealed interface Option<out T : Any> {

    /** get wrapped value as nullable
     * @return wrapped value, unless it is [None] then returns null
     */
    fun getOrNull(): T? {
        return when (this) {
            is None -> null
            is Some<T> -> value
        }
    }

    /** get wrapped value with fallback function
     * @param default fallback function
     * @return wrapped value, unless it is [None] then returns result of the default function.
     */
    fun getOrElse(default: () -> @UnsafeVariance T): T {
        return when (this) {
            is None -> default()
            is Some<T> -> value
        }
    }
}

/**
 * Wrapped value
 * @property value value to wrap
 * @param T type of wrapped value
 * @see Option
 */
data class Some<out T : Any>(val value: T) : Option<T>

/** Wrapped value not present
 * @see Option
 */
object None : Option<Nothing>
