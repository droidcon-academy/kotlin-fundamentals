package section_6.abstract_class

abstract class LivingSpace {
    abstract fun showDetails()

    fun acceptPolicy(isPolicyAccepted: Boolean) {
        println("You must agree to the terms and conditions: $isPolicyAccepted")
    }
}