package section_5

fun main() {
    println("Credit Card Balance Checker!")
    try {
        print("Enter your balance: ")
        val totalBalance = readln().toDouble()
        print("Enter mobile price: ")
        val mobilePrice = readln().toDouble()
        println("You have $${"%.2f".format(totalBalance - mobilePrice)} left")
    }
    catch (e: NumberFormatException) {
        println("The number you wrote contains text.")
        println("Error: ${e.message}.")
    }
}