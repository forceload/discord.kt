package io.github.forceload.discordkt.util.logger

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

object LoggerUtil {
    val timestampMessage: String
        get() {
            val now = Clock.System.now()
            val currentTime = now.toLocalDateTime(TimeZone.currentSystemDefault())

            val day = currentTime.dayOfMonth
            val month = currentTime.monthNumber

            val hour = currentTime.hour
            val minute = currentTime.minute
            val second = currentTime.second

            return """
                |${currentTime.year}-${month.digit(2)}-${day.digit(2)}
                |${hour.digit(2)}:${minute.digit(2)}:${second.digit(2)}
            """.trimMargin().replace("\n", " ")
        }
}

private fun Int.digit(digits: Int) =
    this.toString().padStart(digits, '0')