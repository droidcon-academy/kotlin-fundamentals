package section_3

fun main() {
    print("Enter your age: ")
    val age = readln().toInt()
    if (age >= 18) {
        println("You're eligible to vote.")
    } else {
        println("You're not old enough to vote yet.")
    }
}