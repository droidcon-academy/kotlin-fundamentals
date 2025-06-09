package section_8

data class User(val username: String, val email: String) {
    override fun toString(): String {
        return "The username is $username and the email is $email"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is User) return false
        return username.lowercase() == other.username.lowercase() && email == other.email
    }

    override fun hashCode(): Int {
        return username.hashCode() + email.hashCode()
    }
}

fun main() {
    val u1 = User("alice123", "[email protected]")
    println(u1) // (1) Outputs: User(username=alice123, email=alice@example.com)

    val u2 = u1.copy(username = "bob456") // (2) create a new User by copying u1 with a different username
    println(u2) // Outputs: User(username=bob456, email=alice@example.com)

    println(u1 == User("alice123", "[email protected]")) // (3) true, equality is based on data
    val (name, mail) = u1 // (4) destructuring declaration
    println("Name: $name, Email: $mail") // Outputs: Name: alice123, Email: alice@example.com

    println(u1.hashCode() == User("alice123", "[email protected]").hashCode())
}