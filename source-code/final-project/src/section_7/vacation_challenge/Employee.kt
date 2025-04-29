package section_7.vacation_challenge

class Employee(private var salary: Double) {
    operator fun plus(otherEmployee: Employee) = salary + otherEmployee.salary
}