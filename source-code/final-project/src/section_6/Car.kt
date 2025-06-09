package section_6

class Car(val brand: String, val model: String) {
    fun drive() {
        println("Driving the $brand $model")
    }
}

fun main() {
    val myCar = Car("Toyota", "Corolla")
    myCar.drive()
}