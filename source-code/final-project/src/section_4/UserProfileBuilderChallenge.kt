package section_4

fun main() {
    // Scenario 1: Basic profile with just username
    createUserProfile("john_dev")

    // Scenario 2: Custom display name with named arguments
    createUserProfile("jane_coder", displayName = "Jane the Developer")

    // Scenario 3: Private profile with custom age
    createUserProfile(
        username = "private_user",
        age = 25,
        isPublic = false
    )

    // Scenario 4: Complete profile
    createUserProfile(
        username = "complete_dev",
        displayName = "The Complete Developer",
        age = 30,
        isPublic = true,
        bio = "Passionate Android developer with 5 years of experience"
    )
}

fun createUserProfile(
    username: String,
    displayName: String = username,
    age: Int = 18,
    isPublic: Boolean = true,
    bio: String = "No bio available"
): Boolean {
    println("=== User Profile Created ===")
    println("Username: $username")
    println("Display Name: $displayName")
    println("Age: $age")
    println("Profile Type: ${if (isPublic) "Public" else "Private"}")
    println("Bio: $bio")
    println("========================")
    return true
}