import kotlin.properties.Delegates

fun main(){
    val user = User(mutableMapOf(
        "name" to "Ayush",
        "age" to 22
    ))
    println(user.name)
    println(user.age)
}

class User(val map : MutableMap<String, Any?>) {
    var name: String by map
    var age : Int by map
}