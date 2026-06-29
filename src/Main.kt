fun main() {
    val text = readln()
    // write your code here
    val regex = "([A-Z]+[a-z]*)(\\s[A-Z]+[a-z]*)?".toRegex()
    val result = regex.findAll(text)

    for (i in result){
        println(i.value)
    }

}