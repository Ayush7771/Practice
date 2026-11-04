import kotlin.math.pow

fun main() {
    val input = readln()
    val entry = readln().toInt()
    when (input) {
        "amount" -> compoundingCalculator(amount = entry)
        "percent" -> compoundingCalculator(percent = entry)
        "years" -> compoundingCalculator(years = entry)
    }
}

fun compoundingCalculator(amount : Int = 1000, percent : Int = 5, years : Int = 10 ){
    println((amount * ((1 + percent / 100.0).pow(years))).toInt())
}