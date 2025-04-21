package section_3

fun main() {
    val availableBudget = 1500

    val laptopModel = when (availableBudget) {
        1500 -> {
            println("Last Item!")
            "Droid Laptop D12"
        }
        2000, 2100, 2200 -> "Droid Laptop J25"
        in 2300..2600 -> "Droid Laptop K14"
        else -> "No Laptop available at this price."
    }
    println(laptopModel)
}