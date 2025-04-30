package section_8

fun main() {
    val map = mutableMapOf("Kotlin" to 14, "Java" to 30)
    printMapData(map)
}

fun printMapData(map: Map<String, Int>) {
    map.forEach { (name, age) -> println("name: $name, Age: $age") }
}