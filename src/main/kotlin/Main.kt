import kotlinx.datetime.TimeZone
import kotlinx.datetime.plus
import java.time.ZoneId
import kotlin.time.*
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

fun main(){
    val instant : Instant = Instant.parse("2023-01-02T22:35:01+01:00")

    val timeZone  = TimeZone.of("Asia/Kolkata")
    println(timeZone)
}
