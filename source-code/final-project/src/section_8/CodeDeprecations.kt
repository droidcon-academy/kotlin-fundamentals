package section_8

@Deprecated(
    message = "Use secureLogin() instead. This method is insecure.",
    replaceWith = ReplaceWith("secureLogin(username)")
)
fun legacyLogin(username: String) {
    println("Logging in with legacy method... [INSECURE]")
}

fun secureLogin(username: String) {
    println("Securely logging in user: $username")
}

fun main() {
    secureLogin("admin")
    secureLogin("admin")
}
