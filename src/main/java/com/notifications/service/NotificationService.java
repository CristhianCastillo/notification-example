package com.notifications.service;

import com.notifications.model.NotificationData;
import org.springframework.stereotype.Service;

@Service
public interface NotificationService {

    void initiateNotification(NotificationData notificationData) throws InterruptedException;
}
