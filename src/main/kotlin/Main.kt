import kotlin.properties.Delegates

class Person {

    var age: Int by Delegates.observable(13) { prop, oldValue, newValue ->
        println(newValue >= 18)

    }

    var isAdult: Boolean = age >= 18
        private set
}