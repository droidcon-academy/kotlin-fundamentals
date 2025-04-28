package section_6.companion_object

class Client private constructor() {
    companion object {
        private var id = 0

        fun incrementId() {
            ++id
            println(id)
        }
    }
}