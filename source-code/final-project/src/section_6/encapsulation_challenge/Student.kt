package section_6.encapsulation_challenge

class Student(name: String, age: Int) {
    var name = name
        set(value) {
            field = value
            println("Name saved successfully!")
        }

    var age = age
        set(value) {
            if (value < 5)
                println("Age is not valid")
            else
                field = value
        }
}