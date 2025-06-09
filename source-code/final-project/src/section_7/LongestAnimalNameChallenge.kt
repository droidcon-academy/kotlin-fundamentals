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

    var longest = animals[0]

    for (name in animals) {
        if (name.length > longest.length) {
            longest = name
        }
    }

//    val longest = animals.maxByOrNull { it.length }
//    println("Spotlight Animal: $longest")

    println("Spotlight Animal: $longest")
}
