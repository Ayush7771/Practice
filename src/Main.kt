fun main() {
    val input = readln()
    val splitedString = StringBuilder()

    for (i in input.indices) {
        if (i == input.lastIndex) {
            splitedString.append(input[i])
            break
        }

        if (input[i] == input[i + 1]) {
            splitedString.append(input[i])
        } else {
            splitedString.append(input[i])
            splitedString.append("-")
        }

    }

    val list = splitedString.split("-").toMutableList()
    val output = StringBuilder()
    for (i in list) {
        output.append(i.first())
        output.append(i.length)
    }

    println(output)
}