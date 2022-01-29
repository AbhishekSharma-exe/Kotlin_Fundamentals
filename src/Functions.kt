import java.nio.channels.FileLock

fun main() {
    println(add(5, 2))
    println(sub(5, 2))
    println(multi(5, 2))
    println(divide(5.0F, 2.0F))
    println(average(5.2, 2.1,3.3))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun multi(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Float, b: Float): Float {
    return (a / b)
}
fun average(a: Double,b: Double,c:Double): Double {
    return (a+b+c)/3
}