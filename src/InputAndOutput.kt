import java.util.*

fun main() {

    // Using Scanner Class
    var scan = Scanner(System.`in`)

    print("Enter your name : ")
    var myName = scan.nextLine();   // also, myName = readline()

    println("Enter your age : ")
    var myAge = scan.nextInt()

    println("Hello! $myName, You are $myAge years old.")

}