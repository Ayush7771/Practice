interface ICallbackReceiver {
    fun onBeforeAction()

    fun onAfterAction()

    fun action(ayush: () -> Unit) {
        onBeforeAction()
        ayush()
        onAfterAction()
    }
}

interface ILogger {
    fun getDateTime() = "05.11.2022-14:31:04"

    val format: String
        get() = "[${getDateTime()}]"

    fun printMsg(s: String)
}

class BasicLogger : ILogger {
    override fun printMsg(s: String) {
        println(format + s)
    }

}

class ConsoleNotifier(logger: ILogger) : ICallbackReceiver, ILogger by logger {

    val onBeforeStr = "OnBefore!"
    val onAfterStr = "OnAfter!"

    override fun onBeforeAction() {
        printMsg(onBeforeStr)
    }

    override fun onAfterAction() {
        printMsg(onAfterStr)
    }

}

class ExampleParser(notifier: ConsoleNotifier, logger: BasicLogger)
    : ICallbackReceiver by notifier,
    ILogger by logger {
    fun start() = action { parseFiles() }

    fun parseFiles() : Boolean{
        printMsg("Parsing...")
        return true
    }
}

fun main(){
    val basicLogger = BasicLogger()
    val dateTimeNotifier = ConsoleNotifier(basicLogger)

    val parser = ExampleParser(dateTimeNotifier, basicLogger)

    parser.start()
}

