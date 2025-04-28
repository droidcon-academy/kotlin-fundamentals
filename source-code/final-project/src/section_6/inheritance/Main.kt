package section_6.inheritance

fun main() {
    val man = Human("Kotlin", 14, "Kotlin Island")
    println("Name: ${man.name}, Age: ${man.age}, Origin: ${man.address}.")

    val baby = Baby("Teddy Bear", "Koty", 2, "Babisland")
    println("${baby.age}-year-old ${baby.name} from ${baby.address} loves this ${baby.toy}.")
}