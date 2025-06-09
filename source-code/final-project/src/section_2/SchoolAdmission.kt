package section_2

fun main() {
    var age = 5
    val address = "Alexandria"
    val parentJob = "Developer"
    ++age

    val isAccepted: Boolean = (age >= 5 && address != "Cairo") || (parentJob == "Developer")
    println("Is the student accepted? $isAccepted")
}