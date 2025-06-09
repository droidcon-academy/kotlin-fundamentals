package section_4

fun main() {
    generateUsernameWithDefaultParams(isNumberIncluded = false)
    generateUsernameWithDefaultParams(isNumberIncluded = false, username = "droidcon")
}

fun generateUsernameWithDefaultParams(username: String = "user", isNumberIncluded: Boolean = true) {
    if (isNumberIncluded) {
        val randomNumber = (10000..20000).random()
        println("$username$randomNumber")
    } else {
        println(username)
    }
}
