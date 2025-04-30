package section_8.data_class_challenge

fun main() {
    val firstStudent = Student("Kotlin", "Germany", 14)
    println(firstStudent)

    val secondStudent = Student("Kotlin", "Germany", 14)
    println(firstStudent == secondStudent)

    println(firstStudent.hashCode() == secondStudent.hashCode())
}