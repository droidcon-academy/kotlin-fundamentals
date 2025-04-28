package section_6.student_challenge

fun main() {
    val firstStudent = Student()
    val secondStudent = Student()

    firstStudent.name = "Kotlin"
    firstStudent.age = 14

    secondStudent.name = "Java"
    secondStudent.age = 30

    println("${firstStudent.name} is ${firstStudent.age} years old.")
    println("${secondStudent.name} is ${secondStudent.age} years old.")
}