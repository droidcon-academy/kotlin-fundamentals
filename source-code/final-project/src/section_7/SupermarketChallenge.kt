package section_7

fun main() {
    // Creating our customer databases for each branch
    val cairoCustomers = mutableSetOf<String>()
    cairoCustomers.add("Jordan")
    cairoCustomers.add("Riley")
    cairoCustomers.add("Casey")

    val newDelhiCustomers = mutableSetOf<String>()
    newDelhiCustomers.add("Alex")
    newDelhiCustomers.add("Sam")
    newDelhiCustomers.add("Jordan")
    newDelhiCustomers.add("Riley")

    val newDelhiLocalCustomers = newDelhiCustomers subtract cairoCustomers
    println("New Delhi-only customers: $newDelhiLocalCustomers")
}