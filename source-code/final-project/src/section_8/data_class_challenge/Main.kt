package section_8.data_class_challenge

fun main() {
    val firstStudent = Student("Kotlin", 14)
    firstStudent.address = "Germany"
    println(firstStudent)

    val secondStudent = Student("Kotlin", 14)
    println(firstStudent == secondStudent)

    println(firstStudent.hashCode() == secondStudent.hashCode())
}