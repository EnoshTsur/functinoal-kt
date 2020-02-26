package run

//|-------------|//
//|-SIDE EFFECT-|//
//|-------------|//

var a = 9

fun sideEffect(x: Int) {
    a = x + 1
}


//|---------------|//
//|-PURE FUNCTION-|//
//|---------------|//

fun addPure(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addPureShort(num1: Int, num2: Int) = num1 + num2


//|---------------|//
//|-LAMBDAS-------|//
//|---------------|//

val lambdaPrint: () -> Unit = { println("hi") }

val lambdaOneParam: (String) -> String = { "$it hahaha" }

val lambdaAdd: (Int, Int) -> Int = { x, y -> x + y }


//|---------------------|//
//|-PARTIAL APPLICATION-|//
//|---------------------|//


fun greet(name: String, text: String) = "$name $text"

fun greetEnosh(text: String) = greet("enosh", text)


fun addPartial(num1: Int): (Int) -> Int {
    return { num2 -> num1 + num2 }
}

fun addPartialShort(num1: Int): (Int) -> Int = { num1 + it }

fun <T1, T2, R> ((T1, T2) -> R).partial(t1: T1): (T2) -> R = { this.invoke(t1, it) }


//|----------------------------|//
//|-PARTIAL FUNCTION PARAMETER-|//
//|----------------------------|//

fun actionPartial(fn: (Int, Int) -> Int): (Int, Int) -> Int =
    { num1, num2 -> fn(num1, num2) }


//|---------------------|//
//|-PIPE & COMPOSITION--|//
//|---------------------|//

fun actionsPartial(fns: List<(Int) -> Int>): (Int) -> Int = {
    fns.fold(it, { fn1, fn2 -> fn2(fn1) })
}


fun <T> compose(fns: List<(T) -> T>): (T) -> T = {
    fns.fold(it, { fn1, fn2 -> fn2(fn1) })
}


fun <T1, T2, R> ((T1) -> T2).andThen(f: (T2) -> R): (T1) -> R = { f(this(it)) }


fun main() {



//    val subtract = actionPartial { num1, num2 -> num1 - num2 }
//    val add = actionPartial(lambdaAdd)
//
//    println(add(2, 3))
//    println(subtract(6, 3))
//    println(actionPartial { x, y -> x + y * 2 } (10, 2) )
//
//    val add3: (Int) -> Int = { it + 3 }
//    val sub1: (Int) -> Int = { it - 1 }
//    val mul4: (Int) -> Int = { it * 4 }
//
//
//    val addSubMul = actionsPartial(listOf(add3, sub1, mul4))
//
//    println(
//        addSubMul(2)
//    )
//
//
//    println(
//        compose(
//            listOf(
//                { x: String -> x.toUpperCase() },
//                { x -> "wow $x wow" },
//                { x -> x.filter { it.toLowerCase() != 'o' } }
//            )
//        )("io'omo o tohoeo o moaono o")
//    )
//
//    println( { x: Int -> x + 2}.andThen(add3)(2) )

}


