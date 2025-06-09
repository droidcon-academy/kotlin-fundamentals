package section_7

class Income(val amount: Double)

infix operator fun Budget.plus(income: Income): Budget {
    return Budget(this.getRemaining() + income.amount)
}

fun main() {
    val startingBudget = Budget(500.0)
    val salary = Income(1000.0)
    val bonus = Income(200.0)
    val rent = Expense(300.0)

    val updated = startingBudget plus salary plus bonus minus rent
    println("Final Balance: \$${updated.getRemaining()}")
}
