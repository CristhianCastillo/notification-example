package com.notifications.service.imp;

import com.notifications.model.NotificationData;
import com.notifications.service.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class NotificationServiceImpl implements NotificationService {

    @Override
    public void initiateNotification(NotificationData notificationData) throws InterruptedException {
        System.out.println("Notification service started for " + "Notification ID: " + notificationData.getId());
        Thread.sleep(5000);
        System.out.println("Notification service ended for " + "Notification ID: " + notificationData.getId());
    }
}
