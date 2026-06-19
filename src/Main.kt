fun main(){
    val regex = """(?<city>[A-Za-z\s]+),\s(?<state>[A-Z]{2}):\s(?<areaCode>[0-9]{5})""".toRegex()
    val input = "Coordinates: Madrid, SP: 28080"

    val match = regex.find(input)!!
    println(match.groups["city"]?.value)
// Madrid
    println(match.groups["state"]?.value)
// SP
    println(match.groups["areaCode"]?.value)
// 28080
}