package section_3

fun main() {
    print("Enter your grade letter (A, B, C, D, F): ")

    val grade = readln().trim().uppercase()

    val message = when (grade) {
        "A" -> "Outstanding!"
        "B" -> "Well done!"
        "C" -> "Fair effort."
        "D" -> "Just passed."
        "F" -> "Needs improvement."
        else -> "Unknown grade. Please try again."
    }

    println(message)
}