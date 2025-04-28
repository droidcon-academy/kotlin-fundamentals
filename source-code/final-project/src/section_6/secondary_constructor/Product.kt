package section_6.secondary_constructor

class Product(name: String, price: Double, expiryYear: Int?) {
    init {
        println("$name -> $$price -> ${expiryYear ?: "A forever product"}")
    }

    constructor(name: String, price: Double) : this(name, price - (price * 10 / 100), null) {
        //Write any extra logic that will execute after the primary constructor has been initialized
    }
}