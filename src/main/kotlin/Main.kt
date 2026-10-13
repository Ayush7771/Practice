fun main(){
    val result = grade(true)
    println(
        result(9.0)
    )
}

fun getGrade(x : Double) : Double = x
fun getPenaltyGrade(x : Double) : Double = x - 1


fun grade(isCheat : Boolean) : (Double) -> Double{

    return if (isCheat){
        ::getPenaltyGrade
    } else {
        ::getGrade
    }

}
