package CreationalPatterns.Factory;

import CreationalPatterns.Factory.Notifications.Notification;
import CreationalPatterns.Factory.Notifications.NotificationFactory;

public class Main {
    public static void main(String[] args) {
        Notification smsNotificationService = NotificationFactory.createNotificationService("sms");
        Notification emailNotificationService = NotificationFactory.createNotificationService("email");
        Notification pushNotificationService = NotificationFactory.createNotificationService("push");

        String contactInfo = "34992035287";
        String message = "Hello World";
        String smsResult = smsNotificationService.sendNotification(contactInfo, message);

        String contactEmail = "user@example.com";
        String emailMessageContent = "Hello World";
        String emailResult = emailNotificationService.sendNotification(contactEmail, emailMessageContent);

        String contactPush = "device@13:20";
        String pushMessageContent = "Hello World";
        String pushResult = pushNotificationService.sendNotification(contactPush, pushMessageContent);

        System.out.println(smsResult);
        System.out.println(emailResult);
        System.out.println(pushResult);
    }
}
