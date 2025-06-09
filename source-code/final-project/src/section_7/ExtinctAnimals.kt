package section_7

fun main() {
    val animals = arrayOf(
        "African Forest Elephant",
        "Amur Leopard",
        "Axolotl",
        "Javan Rhino",
        "Mountain Gorilla",
        "Sunda Island Tiger",
        "Tapanuli Orangutan"
    )

    // animals[8] = "Dragon Lizard" // This will cause crash

    for (animal in animals)
        println(animal)
}