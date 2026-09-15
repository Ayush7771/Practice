class BankAccount(
    val accountNumber : String,
    val ownerName: String,
    private var balance : Double
){

    fun deposit(amount : Double) : Boolean{
        if (amount > 0.0){
            balance += amount
            return true
        } else {
            return false
        }
    }

    fun withdraw(amount : Double): Boolean {
        if (amount <= balance && amount > 0.0){
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun getBalance() : Double = balance

    fun displayInfo(){
        println("Account: $accountNumber\nOwner: $ownerName\nBalance: $balance")
    }
}