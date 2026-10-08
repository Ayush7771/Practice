import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.todayIn
import kotlin.time.Clock

fun main(){
    val dateTime: LocalDate = Clock.System.todayIn(TimeZone.of("UTC-5"))

}
