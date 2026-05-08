package tictactoe

import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val list = scanner.nextLine().toList()
    val totalX = mutableListOf<Char>()
    val totalY = mutableListOf<Char>()
    for (i in list) {
        if (i == 'X') {
            totalX.add(i)
        }
        if (i == 'O') {
            totalY.add(i)
        }
    }


    println("---------")
    println("| ${list[0]} ${list[1]} ${list[2]} |")
    println("| ${list[3]} ${list[4]} ${list[5]} |")
    println("| ${list[6]} ${list[7]} ${list[8]} |")
    println("---------")

    var xWins = 0
    var oWins = 0

    if (list[0] == list[1] && list[1] == list[2] && list[0] == 'X') xWins++
    if (list[3] == list[4] && list[4] == list[5] && list[3] == 'X') xWins++
    if (list[6] == list[7] && list[7] == list[8] && list[6] == 'X') xWins++
    if (list[0] == list[3] && list[3] == list[6] && list[0] == 'X') xWins++
    if (list[1] == list[4] && list[4] == list[7] && list[1] == 'X') xWins++
    if (list[2] == list[5] && list[5] == list[8] && list[2] == 'X') xWins++
    if (list[0] == list[4] && list[4] == list[8] && list[0] == 'X') xWins++
    if (list[2] == list[4] && list[4] == list[6] && list[2] == 'X') xWins++

    if (list[0] == list[1] && list[1] == list[2] && list[0] == 'O') oWins++
    if (list[3] == list[4] && list[4] == list[5] && list[3] == 'O') oWins++
    if (list[6] == list[7] && list[7] == list[8] && list[6] == 'O') oWins++
    if (list[0] == list[3] && list[3] == list[6] && list[0] == 'O') oWins++
    if (list[1] == list[4] && list[4] == list[7] && list[1] == 'O') oWins++
    if (list[2] == list[5] && list[5] == list[8] && list[2] == 'O') oWins++
    if (list[0] == list[4] && list[4] == list[8] && list[0] == 'O') oWins++
    if (list[2] == list[4] && list[4] == list[6] && list[2] == 'O') oWins++




    when {
        totalX.size - totalY.size > 1 -> println("Impossible")
        totalY.size - totalX.size > 1 -> println("Impossible")
        xWins > 1 -> println("Impossible")
        oWins > 1 -> println("Impossible")
        xWins > 0 && oWins > 0 -> println("Impossible")
        list[0] == list[1] && list[1] == list[2] -> println("${list[0]} wins")
        list[3] == list[4] && list[4] == list[5] -> println("${list[3]} wins")
        list[6] == list[7] && list[7] == list[8] -> println("${list[6]} wins")
        list[0] == list[3] && list[3] == list[6] -> println("${list[0]} wins")
        list[1] == list[4] && list[4] == list[7] -> println("${list[1]} wins")
        list[2] == list[5] && list[5] == list[8] -> println("${list[2]} wins")
        list[0] == list[4] && list[4] == list[8] -> println("${list[0]} wins")
        list[2] == list[4] && list[4] == list[6] -> println("${list[2]} wins")

        totalX.size <= 4 && totalY.size <= 4 -> println("Game not finished")
        else -> println("Draw")

    }
}