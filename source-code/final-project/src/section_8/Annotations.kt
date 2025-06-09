package section_8

@Target(AnnotationTarget.FUNCTION)
annotation class Animal(val type: String = "Mammal")

fun main() {
    printAnimalName("Snake")
}

@Animal("Reptile")
fun printAnimalName(name: String) {
    println(name)
}