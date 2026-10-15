import kotlin.math.pow

fun main(){
    val anonymousFunction = fun (a : Int, b : Int) = a * b
    val lambdaExpression = {a : Int, b : Int -> a * b}

    println(anonymousFunction(10,20))
    println(lambdaExpression(10,20))
}