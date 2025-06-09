package section_3

fun main() {
    var number = 0
    do {
        print("Enter a positive number: ")
        number = readln().toInt()
    } while (number <= 0)
    println("Great, you entered: $number")
}