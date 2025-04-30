package section_8

fun main() {
    println(sum(3))
}

fun sum(number: Int): Int {
    return sumTailRecursion(number, 0)
}

tailrec fun sumTailRecursion(number: Int, accumulator: Int = 0): Int {
    if (number == 0)
        return accumulator
    else
        return sumTailRecursion(number - 1, accumulator + number)
}