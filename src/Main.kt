fun main(){
    val account = SavingsAccount()

    println(account.bankName)
    println(account.balance) //Not accessible because of protected visibility only child classes can access
    println(account.branch)
    account.changePin() //Not accessible because of private visibility, private member is restricted within declared class

}

open class Account {

    public val bankName = "SBI"
    private val pin = 1234
    protected var balance = 5000
    internal val branch = "Delhi"

    private fun changePin() {
        println("PIN changed")
    }
}

class SavingsAccount : Account() {

    fun test() {
        println(bankName)
        println(pin) //Not accessible because of private
        println(balance)
        println(branch)
    }
}