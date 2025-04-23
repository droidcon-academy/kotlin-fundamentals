package section_4

fun main() {
    val featherPhonePrice = calculatePhonePrice("FeatherPhone")
    println("We sell the feather phone for ${featherPhonePrice * 1.2} at our shop.")
    val cheetahPhonePrice = calculatePhonePrice("CheetahPhone")
    println("We sell the cheetah phone for ${cheetahPhonePrice + 500} at our shop.")
}

fun calculatePhonePrice(modelName: String): Double {
    return if (modelName == "FeatherPhone") 13500.6 else 20000.32
}