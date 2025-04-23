package section_4

fun main() {
    println(validatePasswordLength("droidcon"))
}

fun validatePasswordLength(password: String) = password.length >= 6