fun main(){
    val regex = "\\d+(\\.\\d+)?".toRegex()
    val input = "The charger price is $10.99 and the headphone price $15.49 is on sale."

    val output = StringBuilder()
    var lastIndex = 0
    var result = regex.find(input)

    while (result != null){
        output.append(input.substring(lastIndex, result.range.first))

        val amount = result.value.toDouble() * 1.1

        output.append("%.2f".format(amount))

        lastIndex = result.range.last + 1

        result = result.next()
    }
    output.append(input.substring(lastIndex))

    println(output)
}