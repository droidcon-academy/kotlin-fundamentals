package section_7.vacation_challenge

class Employee(private var salary: Double) {
    fun addSalary(otherEmployee: Employee) = salary + otherEmployee.salary
}