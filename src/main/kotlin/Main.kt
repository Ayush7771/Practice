fun main() {
    10.also {
        println(it)
    }.action { this.times(5) }.also {
        println(it)
    }
}

fun Int.action(args: Int.() -> Int): Int = args()