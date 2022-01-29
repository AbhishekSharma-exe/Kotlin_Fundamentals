import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    print("Enter a number : ")
    var a = scan.nextInt()

    println(" A++ : " + a++)
    println(" ++A : " + ++a)
    println(" A-- : " + a--)
    println(" --A : " + --a)

}
