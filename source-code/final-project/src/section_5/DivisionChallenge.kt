package section_5

fun main() {
    println("=== Division Challenge ===")

    print("Enter numerator: ")
    val numeratorInput = readln()

    print("Enter denominator: ")
    val denominatorInput = readln()

    try {
        val numerator = numeratorInput.toInt()
        val denominator = denominatorInput.toInt()

        val result = numerator / denominator
        println("Result: $numerator ÷ $denominator = $result")
    } catch (e: NumberFormatException) {
        println("Invalid input! Please enter whole numbers only.")
    } catch (e: ArithmeticException) {
        println("Oops! You can't divide by zero.")
    } finally {
        println("Division attempt complete.")
    }
}