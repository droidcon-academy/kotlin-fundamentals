package section_4

fun main() {
    generateUsername()
    generateUsername(isNumberIncluded = false)
    generateUsername("droidcon")
    generateUsername("droidcon", false)
    generateUsername(isNumberIncluded = true, username = "droidcon")
}

fun generateUsername(username: String = "user", isNumberIncluded: Boolean = true) {
    if (isNumberIncluded) {
        val randomNumber = (10000..20000).random()
        println("$username$randomNumber")
    }
    else
        println(username)
}