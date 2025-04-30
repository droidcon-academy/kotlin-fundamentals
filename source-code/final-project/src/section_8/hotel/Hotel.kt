package section_8.hotel

sealed class Hotel {
    data object Motel : Hotel()
    data object Resort : Hotel()
    data object Hostel : Hotel()

    fun determineBoardType() {
        when (this) {
            is Motel -> println("Motel (Half board): A cheap place for motorists!")
            is Resort -> println("Resort (Full board): Designed to provide a complete vacation experience.")
            is Hostel -> println("Hostel (Breakfast only): Offers budget-friendly accommodations, typically with shared rooms.")
        }
    }
}