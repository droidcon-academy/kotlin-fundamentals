package section_8

typealias nameToAge = Map<String, Int>

fun main() {
    val map = mutableMapOf("Kotlin" to 14, "Java" to 30)
    printMapData(map)
}

fun printMapData(map: nameToAge) {
    map.forEach { (name, age) -> println("name: $name, Age: $age") }
}