package section_8

fun main() {
    println(factorial(5))
}

// Public-facing function
fun factorial(n: Int): Int {
    return factorialTailRec(n, 1)
}

// Tail-recursive helper
tailrec fun factorialTailRec(n: Int, accumulator: Int): Int {
    return if (n <= 1) accumulator
    else factorialTailRec(n - 1, accumulator * n)
}
