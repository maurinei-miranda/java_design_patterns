package CreationalPatterns.Factory.Notifications.impl;

import CreationalPatterns.Factory.Notifications.Notification;

public class SMSNotification implements Notification {

    @Override
    public String sendNotification(String contactInfo, String message) {
        return "Sending sms notification to " + contactInfo + ": " + message;
    }
}
