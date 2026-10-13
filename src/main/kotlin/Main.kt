fun main(){
    val text = "Ayush. Gupta. is. the. King. of. Kotlin."
    val textWithoutDot = text.filter ( ::isNotDot )
    println(textWithoutDot)
}

fun isNotDot(c : Char) : Boolean = c != '.'

