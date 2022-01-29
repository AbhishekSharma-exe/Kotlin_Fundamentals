fun main() {
    for (i in 1..10){
        if (i==5){
            break  // Comes out of loop
        }
        print("$i ")
    }
    println()
    for (i in 1..10){
        if (i==5){
            continue // Skips the iteration
        }
        print("$i ")
    }
}