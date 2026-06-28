fun main() {
    val regex = """(\d{4})-(\d{2})-(\d{2})""".toRegex()
    val input = readln() //The event will happen on 2024-04-12.

    val matchResult = regex.find(input)

    printGroups(matchResult)
}

fun printGroups(matchResult: MatchResult?) {
    println(
        """
        Full match: ${matchResult?.groupValues[0]}
        Year: ${matchResult?.groupValues[1]} 
        Month: ${matchResult?.groupValues[2]}
        Day: ${matchResult?.groupValues[3]}
        """.trimIndent()
    )

}