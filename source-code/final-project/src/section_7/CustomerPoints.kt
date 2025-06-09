package section_7

fun main() {
    // Method 1: Create with initial data using 'to' infix function
    val customerPoints = mutableMapOf<String, Int>("Alex" to 1500, "Sam" to 900)
    // Method 2: Add entries using the put() function
    customerPoints.put("Jordan", 550)

    // Method 3: Add entries using indexed access operator
    customerPoints["Riley"] = 1777

    // Method 4: Add multiple entries at once
    customerPoints.putAll(mapOf("Casey" to 1200, "Taylor" to 650))

    println("All customer points: $customerPoints")
}