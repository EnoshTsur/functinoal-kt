package run


class Greeter(var name: String) {

    fun greet(text: String): String {
        return "$text $name"
    }
}


fun greeter(name: String): (String) -> String =
    { "$it $name" }


fun main() {
//    val enoshGreeter = Greeter("enosh")
//    println(enoshGreeter.greet("hi"))
//
//
//    val greetEnosh = greeter("enosh")
//    println(greetEnosh("hi"))
//    println(greeter("yaron")("bye"))
}