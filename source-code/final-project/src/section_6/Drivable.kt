package section_6

interface Drivable {
    fun drive() // (1) abstract method in interface
}

class Truck(val model: String) : Drivable { // (2) Truck implements Drivable
    override fun drive() {
        println("$model truck is hauling cargo down the highway.")
    }
}

class Boat(val name: String) : Drivable { // (3) Boat implements Drivable
    override fun drive() {
        println("$name boat is sailing smoothly on the water.")
    }
}

fun main() {
    val freightliner = Truck("Freightliner") // (4)
    val waveRunner = Boat("WaveRunner")      // (5)

    freightliner.drive() // (6)
    waveRunner.drive()   // (7)
}