package section_5

fun main() {
    val label = validateLabel("Alice", "Berlin", 2.5)

    // Uncomment to test failures
    // validateLabel("", "Berlin", 2.5)       // Missing name
    // validateLabel("Bob", "", 2.5)         // Missing city
    // validateLabel("Sam", "Dubai", 0.0)    // Invalid weight
    println(label)
}

fun validateLabel(name: String?, city: String?, weight: Double): String {
    val trimmedName = name?.trim()
    val trimmedCity = city?.trim()

    require(!trimmedName.isNullOrEmpty()) { "Recipient name cannot be empty or blank." }

    require(!trimmedCity.isNullOrEmpty()) { "City cannot be empty or blank." }

    require(weight > 0) { "Weight must be greater than zero." }

    return "TO: $trimmedName\nDESTINATION: $trimmedCity\nWEIGHT: ${weight}kg"
}