package section_7

fun main() {
    val academyName = "Droidcon"
    println(academyName.validateString())
}

fun String.validateString() = if (isNotBlank() && length >= 6) uppercase() else "Not valid!"