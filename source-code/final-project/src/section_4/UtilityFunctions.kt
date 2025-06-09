package section_4

fun main() {
    println(isEligibleForPremium(17))
    println(calculateTax(100.0))
    println(formatUsername("JOHN_DOE"))
    println(isWeekend("Saturday"))
}

// Age eligibility check
fun isEligibleForPremium(age: Int) = age >= 16

// Tax calculation (10% tax rate)
fun calculateTax(amount: Double) = amount * 0.10

// Username formatting
fun formatUsername(username: String) = username.lowercase()

// Weekend checker
fun isWeekend(day: String) = day == "Saturday" || day == "Sunday"