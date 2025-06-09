package section_2

fun main() {
    val userName = "Alice"
    val band = "The Rocking Kotliners"
    val venue = "Code Arena"
    val seat = 42
    val ticketPrice = 49.99

    println("Hi $userName, your ticket for $band at $venue is confirmed!")
    println("Your seat number is $seat, and the total amount is \$${"%.2f".format(ticketPrice)}. Enjoy the show!")
}
