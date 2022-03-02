class Account {

    var accountNumber:Int = 0
    var name: String =  ""
    var amount: Int = 0

    fun insert(acc: Int, name: String, amt: Int ) {
        accountNumber=acc
        this.name =name
        amount=amt
        println("Account no: $accountNumber holder :${this.name} amount :$amount")
    }

    fun deposit(amt: Int) {
        amount+=amt
        println("Rs. $amt is deposited in Account Number : $accountNumber")
        println("Available Balance : $amount")
    }

    fun withdraw(amt: Int) {
        amount-=amt
        println("Rs. $amt is withdrawn from Account Number : $accountNumber")
        println("Available Balance : $amount")
    }

    fun checkBalance() {
        println("Available Balance : $amount")
    }

}

fun main() {
    val acc= Account()
    acc.insert(832345,"Abhishek Sharma",1000)  //calling member function
    println(acc.name)       //accessing class property
    acc.deposit(100)   //accessing methods
    acc.withdraw(500)
    acc.checkBalance()
}  