import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    val adapter = moshi.adapter(Human::class.java)



    val json = """
        {
        "name" : "Ayush",
        "age" : 22,
        "friends" : ["Mangal", "Anushka"],
        "grades" : {
        "Math" : "B",
        "Science" : "A",
        "English" : "D"
        }
        }
    """.trimIndent()

    val human = Human(
        "Khushi",
        20,
        listOf("Rajiv", "Archana"),
        mapOf(
        "Math" to "A",
        "Philosophy" to "A",
        "Physics" to "D"
    ))

    val newHuman = adapter.fromJson(json)

    val humanList = listOf(human, newHuman)

    println(human)
    println(newHuman)

    val type = Types.newParameterizedType(List::class.java, Human::class.java, Map::class.java)

    val humanListAdapter = moshi.adapter<List<Human?>>(type)

    val listJson : String = humanListAdapter.toJson(humanList)
    println(listJson)

    val backListHuman : List<Human?>? = humanListAdapter.fromJson(listJson)
    println(backListHuman)


}

data class Human (
    val name : String,
    var age : Int,
    var friends : List<String>,
    var grades : Map<String, String>
)