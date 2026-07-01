fun main() {
    val durationIndays = readln().toInt()
    val totalFoodCost = readln().toInt() * durationIndays
    val flightCost = readln().toInt() * 2
    val hotelCost = readln().toInt() * (durationIndays - 1)

    println(totalFoodCost + flightCost + hotelCost)

}