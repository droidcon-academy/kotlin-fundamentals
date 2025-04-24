package section_5

fun main() {
    val address: String? = "Khufu pyramid, Giza, Egypt."
    try {
        println(validateAddress(address))
    }
    catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}

fun validateAddress(address: String?): String {
    require(address != null && address.length > 20) { "Providing a valid address is required!" }
    return "Your shipment will be delivered to: $address"
}