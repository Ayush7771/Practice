fun main(){
    val input = readln()
    val regex = Regex("[A-Z]+[a-z]+[0-9]+")

    println(if(regex.matches(input)) "Password saved" else "Password is too simple")
}