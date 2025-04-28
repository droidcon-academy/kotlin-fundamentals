package section_6.abstract_class

class Apartment : LivingSpace() {
    override fun showDetails() {
        println("3 rooms, 2 balconies, garden view, ..., etc.")
    }
}