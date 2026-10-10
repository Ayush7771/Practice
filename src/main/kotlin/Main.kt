import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

fun main() {
    val human = Human("Ayush", 22, listOf("Mangal", "Khushi", "Anushka"))
    val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    val adapter = moshi.adapter(Human::class.java)

    val json = """
        {
        "name": "Ayush Gupta",
        "age" : "20",
        "friends" : ["Ayush"]
        }
    """.trimIndent()
    println(adapter?.fromJson(json)?.age)

}

data class Human (
    var name : String,
    var age : Int,
    var friends : List<String>
)