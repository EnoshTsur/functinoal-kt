package run

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

fun switchExpression(age: Int): String = when (age) {
    in 4..13 -> "Visiting grandma"
    in 21..35 -> "Lets have a beer"
    36 -> "I dont why but cool age"
    in 37..120 -> "Shlomo Artzi"
    else -> "Very weird"
}

fun thisOrThat(age: Int): String = if (age < 20) "go home" else "go also home"

fun tryTo(): Connection? =
    try { DriverManager.getConnection("hahah no url for you") }
    catch (e: SQLException) { null }

fun main() {

}
