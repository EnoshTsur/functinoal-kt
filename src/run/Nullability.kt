package run

import java.util.*

data class Person(var name: String?)

fun imperative(person: Person?, name: String): Person {
    var newPerson: Person? = null

    if (person != null) {
        person.name = name
        return person

    } else {
        newPerson = Person(name)
        return newPerson
    }
}


fun withPerson(newName: String): (Person?) -> Person = { person ->
    Optional.ofNullable(person).map { it.copy(name = newName) }
        .orElse(Person(newName))
}


fun main() {
    val personNull = null
    val personFull = Person("Yair")

    val changeToAvi = withPerson("Avi")

    println(changeToAvi(personFull))
    println(changeToAvi(personNull))
}