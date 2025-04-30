package section_8.data_class

fun main() {
    val firstStudent = Student("Kotlin", "Germany", 14)
    println(firstStudent)

    val secondStudent = firstStudent.copy(name = "Java")
    println(secondStudent)

    println(firstStudent == secondStudent)
    println(firstStudent.hashCode() == secondStudent.hashCode())

    println(firstStudent.component1())
    println(firstStudent.component2())
    println(firstStudent.component3())

    val (name, address, age) = firstStudent
    println(name)
    println(address)
    println(age)
}

