fun main() {

    val result: (Int, Int) -> Int = compose(5, 7)

    println(result(10, 12))

}

fun compose(a: Int, b: Int): (Int, Int) -> Int {
    return { c, d ->
        c * d * a + b
    }
}