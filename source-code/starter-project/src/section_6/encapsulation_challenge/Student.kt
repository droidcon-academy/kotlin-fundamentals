package section_6.encapsulation_challenge

class Student {
    var name = ""
        set(value) {
            field = value
            println("Name saved successfully!")
        }

    var age = 0
        set(value) {
            if (value < 5)
                println("Age is not valid")
            else
                field = value
        }
}