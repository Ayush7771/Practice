fun add(x: Int, y: Int) = x + y

fun subtract(x: Int, y: Int) = x - y

fun divide(x: Int, y: Int) = x / y

fun multiply(x: Int, y: Int) = x * y

fun calculate(x: Int, y: Int, operator: (Int, Int) -> Int) {
    val result = operator(x,y)
    print(result)
}

fun main() {
    val x: Int = readln().toInt()
    val y: Int = readln().toInt()
    val operator: String = readln()
    when (operator) {
        "add" -> calculate(x,y,::add)
        "subtract" -> calculate(x,y,::subtract)
        "multiply" -> calculate(x,y,::multiply)
        "divide" -> calculate(x,y,::divide)
    }
}
