package section_7

fun main() {
    val roomA = mutableSetOf("Kotlin", "Jetpack", "Compose")
    val roomB = mutableSetOf("Compose", "JavaScript", "Node")

    val allStudents = roomA union roomB
    println("Union: $allStudents")

    val common = roomA intersect roomB
    println("Intersect: $common")

    val onlyInB = roomB subtract roomA
    println("Subtract: $onlyInB")
}