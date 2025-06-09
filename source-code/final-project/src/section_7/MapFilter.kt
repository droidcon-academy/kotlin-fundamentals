package section_7

fun main() {
    val customerPoints = mutableMapOf("Alex" to 1500, "Sam" to 900)
    customerPoints["Jordan"] = 550
    customerPoints["Riley"] = 1777
    customerPoints["Casey"] = 1200

    // Filter customers with points >= 1000
    val winnerCustomers = customerPoints.filter { (customerName, points) -> points >= 1000 }

    // Get just the names of winners
    println("Mystery box winners: ${winnerCustomers.keys}")

    // Get detailed winner information
    println("Winner details: $winnerCustomers")

    // Count how many winners we have
    println("Total winners: ${winnerCustomers.size}")
}