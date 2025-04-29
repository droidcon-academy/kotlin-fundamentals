package section_7

fun main() {
    val customers = mutableMapOf("Kotlin" to 1500, "Java" to 900)
    customers["Lollipop"] = 550
    customers["Nougat"] = 1777

    val winnerCustomers = customers.filter { (_, value) -> value >= 1000 }
    println(winnerCustomers.keys)
}