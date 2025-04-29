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
    animals.shuffle()
    for (element in animals)
        println(element)
}