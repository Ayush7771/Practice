import java.util.Scanner
import kotlin.random.Random

fun main(){
    val scanner = Scanner(System.`in`)
    val random = Random

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val n = scanner.nextInt()

    val generatedPassword = CharArray(n){'.'}

    val lowerCase = mutableListOf<Char>()


    for (i in 'a'..'z'){
        lowerCase.add(i)
    }

    for (i in 1..n){
        val a = random.nextInt(0,n)
        while (generatedPassword[a] == '.'){
            generatedPassword[a] = lowerCase[random.nextInt(0, lowerCase.size)]
        }
    }


    println(generatedPassword.joinToString(""))
}