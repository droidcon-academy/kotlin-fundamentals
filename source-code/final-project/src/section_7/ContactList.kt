package section_7

class Contact(val name: String, val phone: String)

fun main() {
    val contacts = mutableListOf<Contact>()

    // Add contacts
    contacts.add(Contact("Kotlin", "+0101010"))
    contacts.add(Contact("Koti", "+1010101"))

    // Update contact
    contacts[1] = Contact("Koty", "+1010101")

    // Display current state
    printContacts(contacts)

    // Remove a contact
    contacts.removeAt(0)
    printContacts(contacts)

    // Clear all contacts
    contacts.clear()
    printContacts(contacts)
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