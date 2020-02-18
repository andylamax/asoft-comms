package tz.co.asoft.comms

interface EmailMessagingService {
    suspend fun send(sender: String, receivers: List<String>, subject: String? = null, body: String, hasHtmlContent: Boolean = false)
}