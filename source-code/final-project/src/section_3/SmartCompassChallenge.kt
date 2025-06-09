package section_3

fun main() {
    print("Enter direction (N/S/E/W): ")

    val input = readln().trim()

    when (input) {
        "N", "n" -> println("You are heading North")
        "S", "s" -> println("You are heading South")
        "E", "e" -> println("You are heading East")
        "W", "w" -> println("You are heading West")
        else -> println("Unknown direction")
    }
}