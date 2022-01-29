import java.util.*

fun main() {
    // when is same as Switch case in c/c++

    val scan = Scanner(System.`in`)
    print("Enter the Harry Potter movie series number : ")
    val movieNumber = scan.nextInt()

    when (movieNumber) {
        1 -> println("Harry Potter and the Sorcerer's Stone (2001)")
        2 -> println("Harry Potter and the Chamber of Secrets (2002)")
        3 -> println("Harry Potter and the Prisoner of Azkaban (2004)")
        4 -> println("Harry Potter and the Goblet of Fire (2005)")
        5 -> println("Harry Potter and the Order of the Phoenix (2007)")
        6 -> println("Harry Potter and the Half-Blood Prince (2009)")
        7 -> println("Harry Potter and the Deathly Hallows: Part 1 (2010)")
        8 -> println("Harry Potter and the Deathly Hallows: Part 2 (2011)")

        else -> println("Invalid Movie Number")
    }
}