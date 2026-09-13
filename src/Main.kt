abstract class Animal{
    abstract fun move()
    abstract fun makeSound()

    fun eat() = false
    fun sleeping() = false
}

class Cat : Animal() {
    override fun move() {
        println("Walk")
    }

    override fun makeSound() {
        println("meow")
    }

}
