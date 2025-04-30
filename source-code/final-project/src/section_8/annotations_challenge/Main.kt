package section_8.annotations_challenge

import kotlin.reflect.full.findAnnotation

fun main() {
    printAnimalName("Snake")
}

@Animal("Reptile")
fun printAnimalName(name: String) {
    val animalAnnotation = ::printAnimalName.findAnnotation<Animal>()

    val animalType = animalAnnotation?.type
    println("$name is a $animalType")
}
