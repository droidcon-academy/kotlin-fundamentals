package section_6

class BankAccount(private var balance: Double) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }
    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount(100.0)
    account.deposit(50.0)
    println(account.getBalance()) // Outputs: 150.0
    //account.balance = 1000.0 // ERROR: cannot access or modify balance directly
}