package section_8

data class Employee(
    val name: String,
    val id: Int,
    val department: String,
    val yearsOfExperience: Int
) {
    override fun toString(): String {
        return "[ID: $id] $name - $department (${yearsOfExperience} yrs)"
    }
}

fun main() {
    val employees = listOf(
        Employee("Alice Johnson", 101, "Engineering", 5),
        Employee("Bob Lee", 102, "Marketing", 3),
        Employee("Clara Smith", 103, "Human Resources", 8)
    )

    for (employee in employees) {
        println(employee)
    }
}