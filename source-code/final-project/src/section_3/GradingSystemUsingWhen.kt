package section_3

fun main() {
    print("Enter your test score (0-100): ")
    val score = readln().toInt()
    when (score) {
        in 90..100 -> println("Grade: A")
        in 80..89  -> println("Grade: B")
        in 70..79  -> println("Grade: C")
        in 60..69  -> println("Grade: D")
    }
}