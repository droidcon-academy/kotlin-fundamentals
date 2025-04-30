package section_8.annotations

@Target(AnnotationTarget.FUNCTION)
annotation class Animal(val type: String = "Mammal")