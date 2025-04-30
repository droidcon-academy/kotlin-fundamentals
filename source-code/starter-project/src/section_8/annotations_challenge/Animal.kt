package section_8.annotations_challenge

@Target(AnnotationTarget.FUNCTION)
annotation class Animal(val type: String = "Mammal")