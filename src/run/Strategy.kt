package run

interface FlyAble {

    fun canFly(): Boolean
}

class CanFly: FlyAble {

    override fun canFly(): Boolean {
        return true
    }

}

class CantFly: FlyAble {

    override fun canFly(): Boolean {
        return false
    }

}

class Cat(var name: String, var canFlyAble: FlyAble = CantFly()) {

    fun canIFly(): Unit {
        println("$name can fly?: ${canFlyAble.canFly()}")
    }
}


fun flyable(strategy:() -> Boolean): (String) -> String =
    { "$it can fly?: ${strategy()}" }


fun main() {

//    val cat = Cat(name = "mitsy")
//    cat.canIFly()
//    cat.canFlyAble = CanFly()
//    cat.canIFly()
//
//    val canfly = flyable { true }
//    val cantfly = flyable { false }
//
//    println(canfly("mitsy"))
//    println(cantfly("mitsy"))
}

