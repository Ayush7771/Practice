fun main(){
    val result = 10.opp({this * 10})

    println(result)
}

fun Int.opp(f : Int.() -> Int) : Int{
    return  f()
}

fun myString( a : StringBuilder.()-> Unit) : String{
    return StringBuilder().apply(a).toString()
}