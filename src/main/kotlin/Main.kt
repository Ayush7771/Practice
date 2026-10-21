fun square(x: Int, filter : (Int) -> Int) {
    println(filter(x))
}

fun squareCalculation (x : Int) : Int = x * x

fun main(){
    square(10, ::squareCalculation)
}