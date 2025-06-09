package section_5

fun main() {
    parseNumber("20")
    parseNumber("A")
}

fun parseNumber(str: String) {
    try {
        val num = str.toInt()  // this can throw NumberFormatException
        println("Parsed number: $num")
    } catch (e: NumberFormatException) {
        println("Could not parse '$str' as an integer: ${e.message}")
    } finally {
        println("Parsing attempt completed.")
    }
}