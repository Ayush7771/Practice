fun main(){
    println(applyAndSum(3,4, ::same))
    println(applyAndSum(2, 3, ::square))
    println(applyAndSum(5,10,::triple))
}

fun applyAndSum(a : Int, b : Int, transform : (Int) -> Int) : Int{

    return transform(a) + transform(b)
}

fun same(x : Int) = x
fun square(x : Int) = x * x
fun triple(x : Int) = 3 * x