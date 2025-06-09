package section_5

fun main() {
    println(describe("Kotlin"))   // A string of length 6
    println(describe(100))       // An integer: 100
    println(describe(true))      // A boolean: true
    println(describe(null))      // Null value
    println(describe(3.14))      // Unknown type (Double not explicitly handled)
}

fun describe(obj: Any?) = when(obj) {
    null          -> "Null value"
    is String     -> "A string of length ${obj.length}"
    is Int        -> "An integer: $obj"
    is Boolean    -> "A boolean: $obj"
    else          -> "Unknown type"
}