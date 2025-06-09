package section_6

open class Creature(val name: String) {
    open fun speak() {
        println("$name makes a noise") // (1)
    }
}

class Parrot(name: String) : Creature(name) {
    override fun speak() {
        super.speak() // (2)
        println("$name squawks!") // (3)
    }
}

fun main() {
    val polly = Parrot("Polly") // (4)
    polly.speak() // (5)
}