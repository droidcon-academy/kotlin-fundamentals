package section_6

abstract class Appliance(val brand: String) {
    abstract fun turnOn()
    fun plugIn() {
        println("Plugging in the $brand appliance.")
    }
}
class WashingMachine(brand: String): Appliance(brand) {
    override fun turnOn() {
        println("$brand washing machine is now on.")
    }
}
class Refrigerator(brand: String): Appliance(brand) {
    override fun turnOn() {
        println("$brand refrigerator is now running.")
    }
}

fun main() {
    val washer = WashingMachine("Whirlpool")
    val fridge = Refrigerator("LG")

    washer.plugIn() // Outputs: Plugging in the Whirlpool appliance.
    washer.turnOn() // Outputs: Whirlpool washing machine is now on.
    fridge.plugIn() // Outputs: Plugging in the LG appliance.
    fridge.turnOn() // Outputs: LG refrigerator is now running.

    // Cannot create an instance of Appliance
    // val appliance = Appliance("Samsung")
}