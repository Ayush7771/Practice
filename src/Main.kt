fun main(){
    val dog = Dog()
    dog.makeSound()
}

interface Animal{
    fun makeSound()
}

class Dog : Animal{
    override fun makeSound() {
        println("Bark")
    }
}