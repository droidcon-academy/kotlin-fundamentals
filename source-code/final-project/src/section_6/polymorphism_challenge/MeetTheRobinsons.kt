package section_6.polymorphism_challenge

class MeetTheRobinsons : Movie() {
    override fun printQuote(movieName: String) {
        super.printQuote(movieName)
        println("\"Keep Moving Forward\"!")
    }
}