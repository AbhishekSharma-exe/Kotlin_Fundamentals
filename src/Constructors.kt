fun main() {

    var student = Student("Abhishek", 21, "Male")
}

class Student(name: String, age: Int) {  // Primary constructor
    var sName: String = ""
    var sAge: Int = 0
    var sGender: String = ""

    init {                              // Init block to initialize properties as soon as initialization of Object
        sName = name
        sAge = age
        println("From primary constructor :")
        println("Student's Name : $sName")
        println("Student's Age : $sAge")
        println("Student's Gender : $sGender")
        println()
    }

    constructor(n: String, age: Int, gender: String) : this(n, age) {  // Secondary constructor
        sName = n
        sAge = age
        sGender = gender
        println("From Secondary constructor :")
        println("Student's Name : $sName")
        println("Student's Age : $sAge")
        println("Student's Gender : $sGender")

    }
}