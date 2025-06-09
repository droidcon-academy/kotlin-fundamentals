package section_4


fun main() {
    generateUsername()
    generateUsername(false)
    generateUsername("droidcon")
    generateUsername("droidcon", false)
    generateUsername(true, "droidcon")
}

fun generateUsername() {
    val randomNumber = (10000..20000).random()
    println("user$randomNumber")
}

fun generateUsername(isNumberIncluded: Boolean) {
    if (isNumberIncluded) {
        val randomNumber = (10000..20000).random()
        println("user$randomNumber")
    } else {
        println("user")
    }
}

fun generateUsername(username: String) {
    val randomNumber = (10000..20000).random()
    println("$username$randomNumber")
}

fun generateUsername(username: String, isNumberIncluded: Boolean) {
    if (isNumberIncluded) {
        val randomNumber = (10000..20000).random()
        println("$username$randomNumber")
    } else {
        println(username)
    }
}

fun generateUsername(isNumberIncluded: Boolean, username: String) {
    if (isNumberIncluded) {
        val randomNumber = (10000..20000).random()
        println("$username$randomNumber")
    } else {
        println(username)
    }
}

