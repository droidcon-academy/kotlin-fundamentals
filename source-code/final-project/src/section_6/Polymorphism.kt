package section_6

fun commandSpeak(animal: Animal) {
    animal.speak() // (1) calls the appropriate speak() based on the actual animal type
}

fun main() {
    // (2)
    val dog = Dog("Buddy")
    val cat = Cat("Mittens")

    commandSpeak(dog) // (3)
    commandSpeak(cat) // (4)
}