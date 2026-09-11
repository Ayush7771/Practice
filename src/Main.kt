class MyAnimalClass : Animal{
    override val numberOfLimbs: Int = 0
    override fun move() {}

    fun ayush(){

    }
    override fun communicate(): String {
        return ""
    }

}

interface Animal{
    val numberOfLimbs : Int

    fun move()

    fun communicate() : String
}
