import kotlin.properties.Delegates

fun main(){
    val user = User()
    println(user.name)
    user.name = "Papa"
    println(user.name)
    user.name = "Khushi"
    println(user.name)
}

class User {
    var name: String by Delegates.vetoable("Ayush"){property, oldValue, newValue ->
        newValue == "Khushi"
    }
}