fun main() {
    val personGenerator = ::Person
    val ayush = personGenerator("Ayush")
    ayush.printName()
}

class Person(val name : String){
    fun printName(){
        println(name)
    }
}