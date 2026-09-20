interface Animal{
    fun makeSound(){
        println("Animal")
    }
}

interface Bird{
    fun makeSound(){
        println("Bird")
    }
}

class NonHumans : Animal, Bird{
    override fun makeSound(){
        super<Bird>.makeSound()
        super<Animal>.makeSound()
    }
}

fun main(){
    val nonHumans = NonHumans()
    nonHumans.makeSound()
}