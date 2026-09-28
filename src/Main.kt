data class Client(
    val name: String,
    val age: Int,
    val gender: String
)

fun main() {
    val bob = Client("Bob", 29, "Male")
    val john = bob.copy(name = "John")

    val (name1, age1, gender1) = bob
    val (name2, age2, gender2) = john

    println(bob == john)
    println(name1)
    println(age1)
    println(gender1)
    println(name2)
    println(age2)
    println(gender2)
}