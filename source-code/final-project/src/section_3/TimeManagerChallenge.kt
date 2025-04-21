package section_3

import java.time.LocalDateTime

fun main() {
    val currentHour = LocalDateTime.now().hour
    val currentActivity =
        if (currentHour >= 8 && currentHour <= 16) "Coding Time!"
        else if (currentHour == 7 || currentHour == 17 || currentHour == 22) "Eating Time!"
        else "Sleeping Time!"
    println(currentActivity)
}