package section_8

fun main() {
    determineKotlinKeywords("Kotlin") {
        println(it.joinToString())
    }
    determineKotlinKeywords("Kotlin") {
        println(it.joinToString())
    }
}

inline fun determineKotlinKeywords(name: String, k: (keywords: Array<String>) -> Unit) {
    println("Language name: $name")
    k(arrayOf("inline", "sealed", "public", "private"))
}