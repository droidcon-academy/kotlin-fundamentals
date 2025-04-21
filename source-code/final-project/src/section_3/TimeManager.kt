package section_3

import java.time.LocalDateTime

fun main() {
    val currentHour = LocalDateTime.now().hour
    if (currentHour >= 8 && currentHour <= 16){
        println("Coding Time!")
    }
    else if (currentHour == 7 || currentHour == 17 || currentHour == 22){
        println("Eating Time!")
    }
    else{
        println("Sleeping Time!")
    }
}