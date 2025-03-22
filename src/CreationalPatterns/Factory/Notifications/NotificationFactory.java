package CreationalPatterns.Factory.Notifications;

import CreationalPatterns.Factory.Notifications.impl.EmailNotification;
import CreationalPatterns.Factory.Notifications.impl.PushNotification;
import CreationalPatterns.Factory.Notifications.impl.SMSNotification;

public class NotificationFactory {
    public static Notification createNotificationService(String notificationType) {
        return switch (notificationType.toLowerCase()) {
            case "sms" -> new SMSNotification();
            case "email" -> new EmailNotification();
            case "push" -> new PushNotification();
            default -> throw new RuntimeException("Invalid notification type");
        };
    }
}
