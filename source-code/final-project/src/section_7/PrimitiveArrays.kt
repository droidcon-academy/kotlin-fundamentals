package section_7

fun main() {
    val scores = intArrayOf(78, 92, 88, 96)
    val ratings = doubleArrayOf(4.5, 3.8, 5.0, 4.2)

    println("First Score: ${scores[0]}")
    println("Max Rating: ${ratings.maxOrNull()}")
}