package section_6.polymorphism_challenge

class Ratatouille : Movie() {
    override fun printQuote(movieName: String) {
        super.printQuote(movieName)
        println("\"Anyone Can Cook\"!")
    }
}