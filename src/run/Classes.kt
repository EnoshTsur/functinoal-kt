package run

class Person12(_name: String, _age: Int) {

    var name: String = _name
    get()  = field
    set(value) { field = value }


    var age: Int = _age
    get() = field
    set(value) { field = value }



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person12

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

    override fun toString(): String {
        return "Person12(name='$name', age=$age)"
    }

}


data class Person21(val name: String, val age: Int)

fun main() {
//    val personGS = Person12(_name = "yaron", _age =  12)
//    val personGS2 = Person12(_name = "yaron", _age =  12)
//
//    println(personGS == personGS2)
//
//    personGS.name = "yurai"
//
//    println(personGS)

//    val dataPerson = Person21(name = "enosh", age = 29)
//    val dataPerson2 = dataPerson.copy()
//
//    println(dataPerson == dataPerson2)
//    val afterChange = dataPerson.copy(age = 30)
//    println(afterChange)
}