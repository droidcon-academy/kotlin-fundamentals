package section_6

class Student {
    var name = ""
        set(value) {
            field = value
            println("Name saved successfully!")
        }
        get() = "Student name is $field"

    var age = 0
        set(value) {
            if (value < 5) {
                println("Age is not valid")
            } else {
                field = value
            }
        }
        get() = field
}

fun main() {
    val firstStudent = Student()
    val secondStudent = Student()

    firstStudent.name = "Kotlin"
    firstStudent.age = 3

    secondStudent.name = "Java"
    secondStudent.age = 30

    print(firstStudent.name)
}