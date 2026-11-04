import kotlinx.datetime.*

fun howManyDays(year1: Int, month1: Int, day1: Int, year2: Int, month2: Int, day2: Int): Int {
    // Write your code here
    val localDate1 = LocalDate(year1,month1,day1)
    val localDate2 = LocalDate(year2, month2, day2)
    return localDate1.daysUntil(localDate2).apply {  }
    //
}

fun main() {
    val (year1, month1, day1) = readln().split(" ").map { it.toInt() }
    val (year2, month2, day2) = readln().split(" ").map { it.toInt() }

    println(howManyDays(year1, month1, day1, year2, month2, day2))
}