fun main() {
    val zoo = Animal.getMethod()
    val foo = Animal.getMethod()

    println(zoo === foo)

}

object Animal {
    var instance: Animal? = null
    fun getMethod(): Animal? {
        if (instance == null) instance = Animal
        return instance
    }
}