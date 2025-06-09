package section_6

// (1) Superclass with open method and open property
open class Notification(val recipient: String) {
    open val origin: String = "Generic Notification System"
    open fun send(message: String) {
        println("[$origin] Sending to $recipient: $message")
    }
}

// (2) Subclass 1 - overrides both method and property
class EmailNotification(recipient: String, val subject: String) : Notification(recipient) {
    override val origin: String = "Email Server"
    override fun send(message: String) {
        println("[$origin] Email to $recipient | Subject: $subject | Body: $message")
    }
}

// (3) Subclass 2 - overrides both method and property
class SMSNotification(recipient: String) : Notification(recipient) {
    override val origin: String = "SMS Gateway"
    override fun send(message: String) {
        println("[$origin] SMS to $recipient: $message")
    }
}

// (4) Subclass 3 - overrides both method and property
class PushNotification(recipient: String) : Notification(recipient) {
    override val origin: String = "Push Notification Service"
    override fun send(message: String) {
        println("[$origin] Push to $recipient: $message")
    }
}

// (5) Polymorphic function using base class reference
fun notifyUser(notification: Notification, message: String) {
    println("Origin: ${notification.origin}") // Property dispatch
    notification.send(message)               // Method dispatch
}

// (6) Main function to test the behavior
fun main() {
    val email = EmailNotification("john@example.com", "Welcome!")
    val sms = SMSNotification("+123456789")
    val push = PushNotification("John's Phone")

    notifyUser(email, "Thanks for signing up!")   // Uses EmailNotification
    notifyUser(sms, "Your OTP is 123456")         // Uses SMSNotification
    notifyUser(push, "You have a new message!")   // Uses PushNotification
}