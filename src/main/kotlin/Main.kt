fun main() {
    Musician(
        name = "Ayush Gupta",
        prof = "Android Developer",
        id = 1
    ).apply {
        this.prof = "Kotlin Developer"
    }.also {
        println(it)
    }
}

data class Musician(var name: String, var prof: String, var id: Int)