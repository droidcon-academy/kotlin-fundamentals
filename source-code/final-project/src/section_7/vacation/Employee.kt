package section_7.vacation

class Employee(private var salary: Double) {
    fun addSalary(otherEmployee: Employee) = salary + otherEmployee.salary
}
