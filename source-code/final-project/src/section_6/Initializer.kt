package section_6

class Book(title: String, author: String) {
    init {
        println("New book created: $title by $author")
    }
}

fun main() {
    val book = Book("The Kotlin Way", "Alex Developer")
}