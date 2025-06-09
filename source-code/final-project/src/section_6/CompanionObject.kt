package section_6

class Client private constructor() {
    companion object {
        private var id = 0

        fun incrementId() {
            ++id
            println(id)
        }
    }
}

fun main() {
    Client.incrementId()
    Client.incrementId()
}