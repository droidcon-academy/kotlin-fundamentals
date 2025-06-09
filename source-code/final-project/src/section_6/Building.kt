package section_6

class Building {
    var address: String
    var floors: Int

    // Secondary constructor providing a default value for floors
    constructor(address: String) {
        this.address = address
        this.floors = 1                           // default to a single-floor building
    }

    // Another secondary constructor with two parameters
    constructor(address: String, floors: Int) {
        this.address = address
        this.floors = floors
    }
}

fun main() {
    val hut = Building("123 Kotlin Lane")
    val skyscraper = Building("456 Kotlin Ave", 50)

    println("${hut.address}, floors: ${hut.floors}") // Outputs: 123 Kotlin Lane, floors: 1
    println("${skyscraper.address}, floors: ${skyscraper.floors}") // Outputs: 456 Kotlin Ave, floors: 50
}