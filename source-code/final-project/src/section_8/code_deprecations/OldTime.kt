package section_8.code_deprecations

@Deprecated("Deprecated since 2020, use FutureTime as an alternative.")
class OldTime {
    fun quote() = println("Good Old Days are GOLD!")
}