package section_8

enum class Direction(val description: String) {
    NORTH("Moving north"),
    EAST("Moving east"),
    SOUTH("Moving south"),
    WEST("Moving west"),
    UNKNOWN("Unknown direction");
}

fun main() {
    val direction = Direction.NORTH
//    when (direction) {
//        Direction.NORTH -> println("Moving north")
//        Direction.EAST -> println("Moving east")
//        Direction.SOUTH -> println("Moving south")
//        Direction.WEST -> println("Moving west")
//        Direction.UNKNOWN -> println("Unknown direction")
//    }
    println(direction.description)
}

