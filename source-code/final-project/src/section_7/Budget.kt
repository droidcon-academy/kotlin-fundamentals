package section_7

class Budget(private var total: Double) {

    infix operator fun minus(expense: Expense): Budget {
        total -= expense.amount
        return this
    }

    fun getRemaining(): Double = total
}

class Expense(val amount: Double)

fun main() {
    val myBudget = Budget(1000.0)
    val rent = Expense(300.0)
    val groceries = Expense(150.0)

    val updated = myBudget minus rent minus  groceries

    println("Remaining balance: \$${updated.getRemaining()}")
}
