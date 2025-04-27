package section_6.student_challenge

class Student {
    var name = ""
        set(value) {
            field = value
            println("Name saved successfully!")
        }
        get() {
            return name
        }

    var age = 0
        set(value) {
            if (value < 5)
                println("Age is not valid")
            else
                field = value
        }
        get() {
            return age
        }
}