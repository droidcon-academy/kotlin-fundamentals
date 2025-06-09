package section_2

fun main() {
    print("Welcome to Kotlin Café! May I have your name? ")
    val name = readln()

    print("Hi, $name! How many cups of coffee would you like? ")
    val quantity = readln().toInt()

    val pricePerCup = 3.50
    val totalCost = pricePerCup * quantity

    println("Awesome, $name. $quantity cup(s) of coffee coming right up!")
    println("Your total is \$${"%.2f".format(totalCost)}. Thank you!")
}