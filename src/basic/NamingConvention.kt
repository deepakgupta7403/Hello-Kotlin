package basic

fun main() {
    classAndPackageName()
    println()
    functionName()
    println()
    testFunctionName()
    println()
    propertyNames()
    println()
    enumName()
}

fun classAndPackageName() {
    println("<------------------------------------------ Package ------------------------------------------>")
    println("Names of packages are always lower case and do not use underscores Like. com.example.detester")
    println(
        "Using multi-word names is generally discouraged, but if you do need to use multiple words, " +
                "you can either simply concatenate them together or use the camel case Like. com.example.detesterProject"
    )

    println("<------------------------------------------ Class ------------------------------------------>")
    println("Names of classes and objects start with an upper case letter and use the camel case Like. HelloWorld")
    println("open Class HelloWorld() {......}")
    println("object MyHelloWorld: HelloWorld() {......}")
}

fun functionName() {
    println("<------------------------------------------ Function ------------------------------------------>")
    println("Names of functions, properties and local variables start with a lower case letter and use the camel case and no underscores:")
    println("fun processDeclaration(){................}")
    println("val count = 1")
}

fun testFunctionName() {
    println("<------------------------------------------ Test Function ------------------------------------------>")
    println(
        "In tests (and only in tests), it's acceptable to use method names with spaces enclosed in backticks. " +
                "(Note that such method names are currently not supported by the Android runtime.) " +
                "Underscores in method names are also allowed in test code."
    )
    println(
        "class MyTestCase {\n" +
                "     @Test fun `ensure everything works`() { /*...*/ }\n" +
                "     \n" +
                "     @Test fun ensureEverythingWorks_onAndroid() { /*...*/ }\n" +
                "}"
    )
}

fun propertyNames() {
    println("<------------------------------------------ Const ------------------------------------------>")
    println(
        "Names of constants (properties marked with const, " +
                "or top-level or object val properties with no custom get function that hold deeply immutable data) " +
                "should use uppercase underscore-separated names:"
    )
    println("const val MAX_COUNT = 8")
    println("val USER_NAME_CONST = myName")

    println("<------------------------------------------ Properties ------------------------------------------>")
    println("Names of top-level or object properties which hold objects with behavior or mutable data should use camel-case names:")
    println("val mutableCollection: MutableSet<String> = HashSet()")

    println()
    println("Names of properties holding references to singleton objects can use the same naming style as object declarations:")
    println("val PersonComparator: Comparator<Person> = /*...*/")

}

fun enumName() {
    println("<------------------------------------------ Enum ------------------------------------------>")
    println(
        "For enum constants, it's OK to use either uppercase underscore-separated names" +
                " or regular camel-case names starting with an uppercase first letter, depending on the usage."
    )
    println("enum class Color { RED, GREEN }")
}

