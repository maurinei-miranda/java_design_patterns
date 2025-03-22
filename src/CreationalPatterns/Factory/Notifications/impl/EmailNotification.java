package CreationalPatterns.Factory.Notifications.impl;

import CreationalPatterns.Factory.Notifications.Notification;

public class EmailNotification implements Notification {

    @Override
    public String sendNotification(String contactInfo, String message) {
        return "Sending email notification to " + contactInfo + ": " + message;
    }
}
