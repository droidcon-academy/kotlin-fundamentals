package section_6

open class ZooAnimal(val name: String) {
    open fun makeSound() {
        println("$name makes an animal sound.")
    }
}

class Lion(name: String) : ZooAnimal(name) {
    override fun makeSound() {
        println("$name roars!")
    }
}

class Elephant(name: String) : ZooAnimal(name) {
    override fun makeSound() {
        println("$name trumpets!")
    }
}

fun main() {
    val lion = Lion("Leo")
    val elephant = Elephant("Ella")

    lion.makeSound()
    elephant.makeSound()
}