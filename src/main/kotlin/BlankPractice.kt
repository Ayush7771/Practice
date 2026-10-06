interface Animal{
    fun sound()

    object Sound{
        fun sound() = println("Ayush")
    }
}
fun main(){
    Animal.Sound.sound()
}