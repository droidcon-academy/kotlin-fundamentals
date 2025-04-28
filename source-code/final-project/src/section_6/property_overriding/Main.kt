package section_6.property_overriding

fun main() {
    val coastalChameleon = BeachChameleon()
    coastalChameleon.color = "vanilla-white"
    println("Hello, ${coastalChameleon.color} Chameleon!")
}