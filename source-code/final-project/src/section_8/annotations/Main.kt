package section_8.annotations

fun main() {
    section_8.annotations_challenge.printAnimalName("Snake")
}

@Animal("Reptile")
fun printAnimalName(name: String) = println(name)