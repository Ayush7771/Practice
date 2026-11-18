class Pizza{
    fun addToppings(){
        println("Toppings added...")
    }

    fun addCheese(){
        println("Cheese added...")
    }

}

fun main() {
    makePizza {
        addCheese()
        addToppings()
    }
}

fun makePizza(block : Pizza.() -> Unit): Pizza{
    return Pizza().apply(block)

}