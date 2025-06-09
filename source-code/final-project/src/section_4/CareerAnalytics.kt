package section_4

fun main() {
    calculateAverageAge(25, 30, 35, 28, 32)
    findSmallestAge(25, 30, 35, 28, 32)
    findLargestAge(25, 30, 35, 28, 32)
}

fun calculateAverageAge(vararg ages: Int) {
    val sum = ages.sum()
    println("Average age: ${sum / ages.size}")
}

fun findSmallestAge(vararg ages: Int) {
    val smallest = ages.min()
    println("Youngest developer: $smallest")
}

fun findLargestAge(vararg ages: Int) {
    val largest = ages.max()
    println("Most experienced developer: $largest")
}