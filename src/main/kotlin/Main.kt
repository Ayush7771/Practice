import kotlinx.datetime.plus
import kotlin.time.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main(){
    val currentMoment = Clock.System.now()
    println(currentMoment)

    val futureMoment = currentMoment.plus(Duration.parse("5h30m"))
    println(futureMoment)
}