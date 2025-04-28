package section_6.encapsulation_challenge

fun main() {
    val firstStudent = Student("Kotlin", 14)
    val secondStudent = Student("Java", 30)

    println("${firstStudent.name} is ${firstStudent.age} years old.")
    println("${secondStudent.name} is ${secondStudent.age} years old.")
}