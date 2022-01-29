fun main() {
    var myName = "Abhishek Sharma"    // String
    println("Hello! $myName")
    println("Hello! " + myName)

    val myAge: Int  // Int 32 bit and immutable because of val
    myAge = 21
    println("You're $myAge years old")

    val myByte: Byte = 13 // 8 bit
    val myShort: Short = 125 // 16 bit
    val myLong1: Long = 12345678901234567 // 64 bit
    val myLong2: Long = 1234_5678_9_10_11_12 // same as Long, provide readability

    //var myFloat: Float = 123.678 will give error as assigned value is double by default
    var myFloat: Float = 1234.45F // 32 bit
    val myDouble: Double = 2.345678 // 64 bit

    var isRainy = true // Boolean is either true or false

    var myChar = 'A' // Character
    val firstCh = myName[0]
    val lastCh = myName[myName.length - 1]

    print("First letter of $myName is $firstCh and last letter is $lastCh")


}