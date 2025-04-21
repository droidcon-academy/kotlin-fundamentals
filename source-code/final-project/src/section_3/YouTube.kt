package section_3

fun main() {
    println("Hello YouTuber!")
    print("Enter the number of subscribers you have: ")
    val subscriberNumber = readln().toInt()
    print("Total hours watched? ")
    val hoursWatched = readln().toInt()
    print("Video Type? ")
    val videoType = readln().lowercase()
    print("How many months have passed since you started publishing videos? ")
    val monthsPassed = readln().toInt()

    val canJoin = subscriberNumber >= 1000 && videoType == "public" && hoursWatched >= 4000 && monthsPassed <= 12
    println("Can this YouTuber join the YouTube Partner Program? $canJoin")
}