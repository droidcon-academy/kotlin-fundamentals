package section_2

fun main() {
    print("Enter the weight of turkey slices in grams: ")
    val weightInGrams = readln().toDouble()
    print("Enter the total number of bread loaves: ")
    val totalBreadLoaves = readln().toInt()

    val weightInKg = (weightInGrams / 1000)
    val price = (weightInKg * 550) + (totalBreadLoaves * 5)
    println("You should pay: ${"%.2f".format(price)}")
}