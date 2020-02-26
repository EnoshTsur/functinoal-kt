package run


data class Human(var name: String, var age: Int)
data class Human2(val name: String, val age: Int)


fun isContains(text: String): (Human2) -> Boolean = { it.name.contains(text) }
fun addToHuman(text: String): (Human2) -> Human2 = { it.copy(name = "${it.name} $text")}

fun imperative() {
    val kobi = Human(name = "kobi", age = 29)
    val avner = Human(name = "avner", age = 32)
    val sasson = Human(name = "sasson", age = 41)
    val yurai = Human(name = "yurai", age = 22)



    val friends = mutableListOf<Human>()
    friends.add(kobi)
    friends.add(avner)
    friends.add(sasson)
    friends.add(yurai)


    val friendsIterator = friends.iterator()
    while (friendsIterator.hasNext()) {
        val fr = friendsIterator.next()
        if (fr.name.contains("a")) {
            val currentName = friends[friends.indexOf(fr)].name
            friends[friends.indexOf(fr)].name = "$currentName hi"
        } else {
            friendsIterator.remove()
        }
    }

    println(friends)
}

fun declarative() {

    val containsA = isContains("a")
    val addByeToHuman = addToHuman("bye")


    val friends = listOf(

        Human2(name = "kobi", age = 29),
        Human2(name = "avner", age = 32),
        Human2(name = "sasson", age = 41),
        Human2(name = "yurai", age = 22)

    ).filter ( containsA )
        .map( addByeToHuman )

    println(friends)
}

fun main() {

    declarative()
}