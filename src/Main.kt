fun main(){
    val account = BankAccount()

    account.deposit(500)
    account.deposit(200)

    println(account.getBalance())

}

class BankAccount {
    var balance = 1000

    // Deposit ka member function banao
    // amount receive kare
    // balance ko increase kare
    fun deposit(amount : Int){
        balance += amount
    }

    // Balance return karne ka member function banao
    fun getBalance(): Int{
        return balance
    }
}