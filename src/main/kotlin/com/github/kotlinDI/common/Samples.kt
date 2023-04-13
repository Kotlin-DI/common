package com.github.kotlinDI.common

import com.github.kotlinDI.common.annotations.IDependency
import com.github.kotlinDI.common.interfaces.Dependency
import com.github.kotlinDI.common.types.*

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
    val opt: Option<Int> = nullableValue.toOption()
    assert(opt == None)

    val res = when (some) {
        is None -> 0
        is Some -> some.value + 1
    }
    assert(res == 43)
}