package section_7

fun main() {
    val storedUsername = "JohnDoe123"
    val enteredUsername = "johndoe123"

    // Regular call
    println(storedUsername.isSameAs(enteredUsername))

    // Infix call
    println(storedUsername isSameAs enteredUsername)
}

// Extension infix function to compare usernames ignoring case
infix fun String.isSameAs(other: String): Boolean = this.equals(other, ignoreCase = true)