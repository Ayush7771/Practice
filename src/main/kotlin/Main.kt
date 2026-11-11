fun main(){
    "Ayush".greet()
    println(10.double())

}

fun String.greet(){
    println("Hello $this")
}

fun Int.double() : Int{
    return (this * 2)
}