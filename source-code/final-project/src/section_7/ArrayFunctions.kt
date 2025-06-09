package section_7

fun main() {
    val scores = intArrayOf(91, 85, 76, 88)

    println("Scores: ${scores.joinToString()}")
    println("Sum: ${scores.sum()}")
    println("Average: ${scores.average()}")
    println("Max: ${scores.maxOrNull()}")
    println("Sorted: ${scores.sorted()}")
    println("Contains 85? ${scores.contains(85)}")
}