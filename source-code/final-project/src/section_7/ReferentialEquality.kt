package section_7

fun main() {
    var animals: Array<out Any>
    val extinctAnimals: Array<String> = arrayOf("Saola", "Pangolin")
    animals = extinctAnimals

    println(animals === extinctAnimals)
}