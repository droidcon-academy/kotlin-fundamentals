package section_7.collection_list

fun main() {
    mutableListOf<Contact>().apply {
        add(Contact("Kotlin", "+0101010"))
        add(Contact("Koti", "+1010101"))
        this[1] = Contact("Koty", "+1010101")
        printContacts(this)
        removeAt(0)
        printContacts(this)
        clear()
        printContacts(this)
    }
}

fun printContacts(contacts: List<Contact>) {
    val generalTitle = if (contacts.size > 1) "You have ${contacts.size} contacts:"
    else if (contacts.size == 1) "You have ${contacts.size} contact:"
    else "No contacts yet!"
    println(generalTitle)

    for (item in contacts)
        println("Name: ${item.name}, Phone: ${item.phone}")

    println("--------")
}