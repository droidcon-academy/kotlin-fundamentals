package section_4

fun main() {
    processNewDevelopers(10, 20, 30)
}

fun processNewDevelopers(vararg ages: Int) {
    fun calculateAverageAge() {
        val sum = ages.sum()
        println(sum / ages.size)
    }

    fun findSmallestAge() {
        val smallest = ages.min()
        println(smallest)
    }

    fun findLargestAge() {
        val largest = ages.max()
        println(largest)
    }

    calculateAverageAge();findSmallestAge();findLargestAge()
}