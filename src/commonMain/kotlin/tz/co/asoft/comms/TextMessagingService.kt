package tz.co.asoft.comms

interface TextMessagingService {
    suspend fun send(sender: String, receivers: List<String>, body: String, hasUnicodeChars: Boolean = false)
}