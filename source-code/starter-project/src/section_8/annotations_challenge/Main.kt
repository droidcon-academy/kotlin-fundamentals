package section_8.annotations_challenge

fun main() {
    printAnimalName("Snake")
}

@Animal("Reptile")
fun printAnimalName(name: String) = println(name)