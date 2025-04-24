package section_5

fun main() {
    val username: String? = null

    val telegramHandle = username ?: "+201547"
    println("t.me/$telegramHandle")
}