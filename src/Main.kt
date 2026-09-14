abstract class Animal{
    abstract fun makeSound()

    fun sleep(){
        println("Sleeping")
    }
}

class Dog : Animal(){
    override fun makeSound() {
        println("Woof")
    }
}

fun main(){
    val dog = Dog()
    dog.makeSound()
    dog.sleep()
}
