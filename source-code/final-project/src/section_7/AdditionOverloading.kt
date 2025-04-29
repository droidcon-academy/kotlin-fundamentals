package section_7

fun main() {
    val a: Int? = 10
    println(a + 8)
    println(a plus 8)
}

infix operator fun Int?.plus(otherNumber: Int) = this?.plus(otherNumber)