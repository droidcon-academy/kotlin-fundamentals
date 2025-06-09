package section_4

fun main() {
    analyzeDeveloperAges(25, 30, 35, 28, 32)
}

fun analyzeDeveloperAges(vararg ages: Int) {

    fun calculateAverage() {
        val sum = ages.sum()
        println("Average age: ${sum / ages.size}")
    }

    fun findYoungest() {
        val smallest = ages.min()
        println("Youngest developer: $smallest")
    }

    fun findMostExperienced() {
        val largest = ages.max()
        println("Most experienced developer: $largest")
    }

    // Execute all analyses
    calculateAverage(); findYoungest(); findMostExperienced()
}