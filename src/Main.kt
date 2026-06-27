fun main() {
    val a = 20
    val b = 10
    val c = 35

    val dubai = City("dubai")
    dubai.temperature = a

    val moscow = City("moscow")
    moscow.temperature = b

    val hanoi = City("hanoi")
    hanoi.temperature = c
    printColdestCity(dubai, moscow, hanoi)
}

// Do not change the constructor
class City(val name: String) {
    // Do not change the property name "temperature"
    var temperature: Int = 0
        set(value) {
            field = if (value !in -97..57) defaultTemp(name) else value
        }

    fun defaultTemp(name: String): Int {
        return when (name) {
            "dubai" -> 30
            "moscow" -> 5
            "hanoi" -> 20
            else -> 0
        }
    }
}

fun printColdestCity(dubai: City, moscow: City, hanoi: City) {
    // Implement the comparison logic here
    val lowestTemp = listOf<Int>(dubai.temperature, moscow.temperature, hanoi.temperature).min()

    val result = if (dubai.temperature == lowestTemp && moscow.temperature == lowestTemp
        || hanoi.temperature == lowestTemp && moscow.temperature == lowestTemp
        || hanoi.temperature == dubai.temperature
    ) "neither" else ""

    println(result)
}