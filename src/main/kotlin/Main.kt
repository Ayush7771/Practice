import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    val list = mutableMapOf<Int, Int>()
    var rejectedReports = 0

    var lastAcceptedTime = 0
    var lastAcceptedHouse = 0

    while (scanner.hasNextInt()){
        val time = scanner.nextInt()
        val house = scanner.nextInt()
        list[time] = house

        if (list.size == 1){
            lastAcceptedTime = time
            lastAcceptedHouse = house
            continue
        }

        val timeAvailable = kotlin.math.abs(time - lastAcceptedTime)
        val houseDistance = kotlin.math.abs(house - lastAcceptedHouse)

        if (timeAvailable < houseDistance){
            rejectedReports++
        } else {
            lastAcceptedTime = time
            lastAcceptedHouse = house
        }
    }

    println(rejectedReports)
}