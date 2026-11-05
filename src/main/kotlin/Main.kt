fun main(){
    println(generate("half")(10))
}

fun identity(agr : Int) : Int = agr
fun half(agr : Int) : Int = agr / 2
fun zero(agr : Int) : Int = 0

fun generate(functionName: String): (Int) -> Int {

    return when (functionName){
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}