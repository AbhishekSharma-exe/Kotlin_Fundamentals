fun main() {
    var nullable: String? = "Abhishek"  // Nullable variable

    // nullable = null

    var name = nullable ?: "Guest"     // Elvis Operator

    println(name.toLowerCase())

    println(nullable!!.toLowerCase())

}