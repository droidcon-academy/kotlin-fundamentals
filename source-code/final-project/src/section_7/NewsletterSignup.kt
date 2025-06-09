package section_7

fun main() {
    val newsletterSubscribers = mutableSetOf<String>()

    println("Adding: ali@email.com")
    newsletterSubscribers.add("ali@email.com")

    println("Adding: dana@email.com")
    newsletterSubscribers.add("dana@email.com")

    println("Adding: ali@email.com again")
    newsletterSubscribers.add("ali@email.com")

    println("\nUnique Subscribers:")
    for (email in newsletterSubscribers) {
        println("- $email")
    }
}