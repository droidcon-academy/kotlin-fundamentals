package section_8

fun main() {
    repeat(2) {
        runAction("Logging user login") {
            println("Saving login record to database.")
        }
    }
}

inline fun runAction(tag: String, action: () -> Unit) {
    println("ACTION START: $tag")
    action()
    println("ACTION END: $tag")
}
