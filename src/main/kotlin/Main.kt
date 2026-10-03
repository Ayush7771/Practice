import kotlin.time.Clock
import kotlin.time.Duration
import kotlin.time.Instant

fun main(){
    val instant : Instant = Clock.System.now()
    val ms = instant.toEpochMilliseconds()
    val second = Instant.fromEpochMilliseconds(ms)
    val futureInstant = instant.plus(Duration.parse("5h30m"))
    println(instant)
    println(futureInstant)
}