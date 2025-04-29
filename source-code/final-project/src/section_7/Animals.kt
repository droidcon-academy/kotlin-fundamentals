package section_7

fun main() {
    var animals: Array<out Any> = arrayOf("Cat", "Dog")
    val extinctAnimals: Array<String> = arrayOf("Saola", "Pangolin")
    animals = extinctAnimals
    println(animals.joinToString())

    println(animals === extinctAnimals)

    val insects = arrayOf("Ant", "Bee")
    val otherInsects = arrayOf("Bee", "Ant")
    println(insects contentEquals otherInsects)
}