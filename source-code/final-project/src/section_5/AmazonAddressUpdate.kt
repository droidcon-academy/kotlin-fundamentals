package section_5

fun main() {
    val isOnConfirmationOrSettingsPages = true

    fun addAddress() {
        check(isOnConfirmationOrSettingsPages) { "You cannot add an address to this page." }
    }

    try {
        addAddress()
        println("Address added successfully!")
    }
    catch (e: IllegalStateException) {
        println(e.message)
    }
}