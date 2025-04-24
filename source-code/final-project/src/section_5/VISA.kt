package section_5

fun main() {
    val visaPassword: Any = "0147"
    val intVisaPassword = visaPassword as? Int
    println(intVisaPassword)
}