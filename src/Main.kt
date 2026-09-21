import kotlin.properties.Delegates

fun main(){
    val user = User()
    println(user.name)
    user.name = "Khushi"
    println(user.name)
}

class User {
    var name: String by Delegates.observable("Ayush"){property, oldValue, newValue ->
        println("${property.name}: $oldValue -> $newValue")
    }
}