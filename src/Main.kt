fun main(){
    val a = Size()
}

open class Size(){
    protected open var age = 10

}

class square : Size(){
    fun printx(){
        println(age)
    }
}