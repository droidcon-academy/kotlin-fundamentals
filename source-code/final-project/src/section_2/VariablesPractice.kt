package section_2

fun main() {
    val name = "Alice"
    val birthYear = 1990
    var currentYear = 2025
    val age = currentYear - birthYear
    println("$name's age: $age")
    currentYear = 2026
    println("$name's age next year: ${currentYear - birthYear}")
}