package section_6

class Person(val name: String = "Anonymous", var age: Int = 0) {
    fun greet() {
        println("Hello, my name is $name.")
    }
}

fun main() {
    val p = Person()
    val q = Person("Alice", 30)
    println(p.name) // Outputs: Anonymous
    println(q.age) // Outputs: 30
}