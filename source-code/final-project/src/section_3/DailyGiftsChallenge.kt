package section_3

fun main() {
    println("Daily Gifts")
    println("Redeem your Daily Gift now")
    println("Daily gift will grant you social megabytes to be used until the end of day.")

    val currentDay = 3
    val socialMegabytes = when (currentDay) {
        1 -> 20
        2, 3 -> 25
        else -> 30
    }
    println("Day $currentDay\t$socialMegabytes Social Megabytes")
}