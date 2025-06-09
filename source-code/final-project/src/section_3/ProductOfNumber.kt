package section_3

fun main() {
    print("Enter a number: ")

    val number = readln().toInt()

    for (i in 1..10) {
        val product = number * i
        println("$number * $i = $product")
    }
}
