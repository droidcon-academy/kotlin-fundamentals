package section_4

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("Enter first number: ")
    val first = readln().toInt()

    print("Enter second number: ")
    val second = readln().toInt()

    val result = addNumbers(first, second)

    println("The sum of $first and $second is $result")
}