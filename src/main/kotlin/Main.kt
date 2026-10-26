fun main() {
    println(
        Musician(
            name = "Ayush Gupta",
            prof = "Android Developer",
            id = 1
        ).apply {
            this.prof = "Kotlin Developer"
        }
    )
}

data class Musician(var name: String, var prof: String, var id: Int)