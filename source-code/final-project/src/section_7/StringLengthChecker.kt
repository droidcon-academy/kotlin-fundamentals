package section_7

fun main() {
    val academyName = "Droidcon"
    println(academyName.hasLength(8))
    println(academyName hasLength 8)
}

infix fun String.hasLength(no: Int) = length == no