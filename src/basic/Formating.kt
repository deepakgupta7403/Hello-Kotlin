package basic

fun main() {
    indentation()
    whiteSpace()
    colon()
    classHeaderFormatting()
    modifiers()
}

fun indentation() {
    println("<------------------------------------------ Indentation ------------------------------------------>")
    println("Use 4 spaces for indentation. Do not use tabs.")
    println(
        "For curly braces, put the opening brace in the end of the line where the construct begins, " +
                "and the closing brace on a separate line aligned horizontally with the opening construct."
    )
    println(
        "if (elements != null) {\n" +
                "    for (element in elements) {\n" +
                "        // ...\n" +
                "    }\n" +
                "}"
    )

    println()
    println()
    println(
        "(Note: In Kotlin, semicolons are optional, and therefore line breaks are significant. " +
                "The language design assumes Java-style braces, and you may encounter surprising behavior if you try to use a different formatting style.)"
    )
    println()
    println()
}

fun whiteSpace() {
    println("<------------------------------------------ White Space ------------------------------------------>")
    println("Put spaces around binary operators (a + b). Exception: don't put spaces around the \"range to\" operator (0..i).")
    println("Do not put spaces around unary operators (a++)")
    println("Put spaces between control flow keywords (if, when, for and while) and the corresponding opening parenthesis.")
    println("Do not put a space before an opening parenthesis in a primary constructor declaration, method declaration or method call.")

    println(
        "Never put a space after (, [, or before ], ).\n" +
                "\n" +
                "Never put a space around . or ?.: foo.bar().filter { it > 2 }.joinToString(), foo?.bar()\n" +
                "\n" +
                "Put a space after //: // This is a comment\n" +
                "\n" +
                "Do not put spaces around angle brackets used to specify type parameters: class Map<K, V> { ... }\n" +
                "\n" +
                "Do not put spaces around ::: Foo::class, String::length\n" +
                "\n" +
                "Do not put a space before ? used to mark a nullable type: String?\n" +
                "\n" +
                "As a general rule, avoid horizontal alignment of any kind. Renaming an identifier to a name with a different length should not affect the formatting of either the declaration or any of the usages."
    )
}

fun colon() {
    println("<------------------------------------------ Colon ------------------------------------------>")
    println(
        "Put a space before : in the following cases:\n" +
                "\n" +
                "when it's used to separate a type and a supertype;\n" +
                "when delegating to a superclass constructor or a different constructor of the same class;\n" +
                "after the object keyword.\n" +
                "Don't put a space before : when it separates a declaration and its type.\n" +
                "\n" +
                "Always put a space after :."
    )
}

fun classHeaderFormatting() {
    println("Classes with a few primary constructor parameters can be written in a single line:")
    println("class Person(id: Int, name: String)")
    println()
    println(
        "Classes with longer headers should be formatted so that each primary constructor parameter is in a separate line with indentation. Also, the closing parenthesis should be on a new line. " +
                "If we use inheritance, then the superclass constructor call or list of implemented interfaces should be located on the same line as the parenthesis:"
    )
    println(
        "class Person(\n" +
                "    id: Int,\n" +
                "    name: String,\n" +
                "    surname: String\n" +
                ") : Human(id, name) { /*...*/ }"
    )

    println("For multiple interfaces, the superclass constructor call should be located first and then each interface should be located in a different line:")
    println(
        "class Person(\n" +
                "    id: Int,\n" +
                "    name: String,\n" +
                "    surname: String\n" +
                ") : Human(id, name),\n" +
                "    KotlinMaker { /*...*/ }"
    )

}

fun modifiers() {
    println("If a declaration has multiple modifiers, always put them in the following order:")
    println(
        "public / protected / private / internal\n" +
                "expect / actual\n" +
                "final / open / abstract / sealed / const\n" +
                "external\n" +
                "override\n" +
                "lateinit\n" +
                "tailrec\n" +
                "vararg\n" +
                "suspend\n" +
                "inner\n" +
                "enum / annotation\n" +
                "companion\n" +
                "inline\n" +
                "infix\n" +
                "operator\n" +
                "data"
    )
}