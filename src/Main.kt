fun main(){
    val lazyValue : String by lazy {
        println("first")
        "second"
    }
    println(lazyValue)
    println(lazyValue)
}