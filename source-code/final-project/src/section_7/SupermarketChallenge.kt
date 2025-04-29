package section_7

fun main() {
    val cairoCustomers = mutableSetOf<String>()
    cairoCustomers.add("Kotlin")
    cairoCustomers.add("Lollipop")

    val newDelhiCustomers = mutableSetOf<String>()
    newDelhiCustomers.add("Java")
    newDelhiCustomers.add("Kotlin")

    val allCustomers = cairoCustomers union newDelhiCustomers
    println(allCustomers)

    val globalCustomers = cairoCustomers intersect newDelhiCustomers
    println(globalCustomers)

    val cairoLocalCustomers = cairoCustomers subtract newDelhiCustomers
    println(cairoLocalCustomers)

    val newDelhiLocalCustomers = newDelhiCustomers subtract cairoCustomers
    println(newDelhiLocalCustomers)
}