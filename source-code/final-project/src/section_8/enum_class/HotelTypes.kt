package section_8.enum_class

enum class HotelTypes(val description: String) {
    Motel("A cheap place for motorists!"),
    Resort("Designed to provide a complete vacation experience."),
    Hostel("Offers budget-friendly accommodations, typically with shared rooms.");

    fun determineBoardType() {
        when (this) {
            Motel -> println("$name (Half board): $description")
            Resort -> println("$name (Full board): $description")
            Hostel -> println("$name (Breakfast only): $description")
        }
    }
}