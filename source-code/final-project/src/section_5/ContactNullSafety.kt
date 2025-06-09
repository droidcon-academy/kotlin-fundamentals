package section_5

fun main() {
    println("=== Contact Management System ===")

    // Simulating contact data (some fields might be null)
    val contactName: String? = "John Doe"
    val phoneNumber: String? = null
    val email: String? = "john.doe@email.com"
    val company: String? = null

    println("\n--- Processing Contact ---")

    // Safe call: won't crash if contactName is null
    println("Name length: ${contactName?.length}")

    // Not-null assertion: this will crash if email is null
    println("Email in uppercase: ${email!!.uppercase()}")

    // Elvis operator-style fallback
    println("Company: ${company ?: "Not specified"}")

    // CRASH TEST: Uncomment below to see a crash due to null + !!
    // println("Phone number length: ${phoneNumber!!.length}")
}