package com.github.kotlin_di.common

import com.github.kotlin_di.common.annotations.IDependency
import com.github.kotlin_di.common.interfaces.Dependency
import com.github.kotlin_di.common.types.Key
import com.github.kotlin_di.common.types.None
import com.github.kotlin_di.common.types.Option
import com.github.kotlin_di.common.types.Some

/**
 * @suppress
 */
internal fun iDependencySample() {
    @IDependency("foo")
    fun Foo(props: Any): Any {
        TODO("Not yet implemented")
    }

    @IDependency("bar")
    class Bar : Dependency<Any, Any> {
        override fun invoke(args: Any): Any {
            TODO("Not yet implemented")
        }
    }
}

/**
 * @suppress
 */
internal fun keySample() {
    object {
        val bar = Key<Any, Any>("bar")
    }
}

/**
 * @suppress
 */
internal fun optionSample() {
    var variable = 10
    val some: Option<Int> = Some(42)
    val value: Int = some.getOrElse {
        variable += 1
        variable
    }
    assert(value == 42)

    val none: Option<Int> = None
    val nullableValue: Int? = none.getOrNull()
    assert(nullableValue == null)

    val res = when (some) {
        is None -> 0
        is Some -> some.value + 1
    }
    assert(res == 43)
}