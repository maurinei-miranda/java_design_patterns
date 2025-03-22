package CreationalPatterns.Factory.Notifications.impl;

import CreationalPatterns.Factory.Notifications.Notification;

public class PushNotification implements Notification {

    @Override
    public String sendNotification(String contactInfo, String message) {
        return "Sending push notification to " + contactInfo + ": " + message;
    }
}
