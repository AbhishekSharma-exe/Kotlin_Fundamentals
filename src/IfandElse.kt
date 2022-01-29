import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    print("Enter your Age : ")
    var age = scan.nextInt()

    if (age >= 18) {
        println("You are eligible to vote!")
    } else if (age < 0) {
        println("Invalid Age!")
    } else {
        println("You are not eligible to vote!")
    }
}