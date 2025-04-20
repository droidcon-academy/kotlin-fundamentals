package section_2

fun main() {
    val timeInMillis = 5429000
    val totalTimeInSeconds = timeInMillis / 1000 //5429 total seconds

    //hours = 5429 / 3600 = "1".508 hours
    val hours = totalTimeInSeconds / 3600
    //minutes = 5429 % 3600 = 1829 remaining seconds / 60 = "30".483 minutes
    val minutes = totalTimeInSeconds % 3600 / 60
    //seconds = 5429 % 60 = "29" remaining seconds
    val seconds = totalTimeInSeconds % 60

    println("$hours:$minutes:$seconds")
}