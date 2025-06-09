package section_8

typealias UserList = MutableList<User>

fun printUsers(users: UserList) {
    for (user in users) {
        println("Username: ${user.username}, Email: ${user.email}")
    }
}

fun main() {
    val users: UserList = mutableListOf(
        User("alice", "alice@example.com"),
        User("bob", "bob@example.com"),
        User("carol", "carol@example.com")
    )

    printUsers(users)
}