package section_6

open class Animal(val name: String) { // (1) open class, can be inherited
    open fun speak() {
        println("$name makes a noise") // (2) default implementation
    }
}
class Dog(name: String): Animal(name) { // (3) Dog inherits from Animal
    override fun speak() {
        println("$name barks") // (4) override speak for Dog
    }
    fun wagTail() {
        println("$name is wagging its tail")
    }
}
class Cat(name: String): Animal(name) {
    override fun speak() {
        println("$name meows") // (5) Cat's override of speak
    }
}

fun main() {
    val dog = Dog("Buddy")
    val cat = Cat("Whiskers")
    dog.speak() // (6) Outputs: Buddy barks
    dog.wagTail() // Outputs: Buddy is wagging its tail
    cat.speak() // (7) Outputs: Whiskers meows
}