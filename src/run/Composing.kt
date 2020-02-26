package run

fun <T> compose(fns: List<(T) -> T>, first: T): T =
    fns.fold ( first, { value, fn -> fn(value)} )

fun add(first: Int): (Int) -> Int = { first + it }

val add4 = add(4)
val add3 = add(3)

fun main() {

    val nine = compose(listOf(add3, add4), 2)
   
    println(nine)
}