import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.TimeZone
import kotlinx.datetime.periodUntil
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.until
import kotlin.time.*

fun main(){
    val year2000 = Instant.parse("2000-01-01T00:00:00Z")
    val now = Clock.System.now()
    println(year2000.until(now, DateTimeUnit.DAY, TimeZone.UTC))
}