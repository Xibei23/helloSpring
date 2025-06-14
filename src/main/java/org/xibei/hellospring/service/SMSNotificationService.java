package org.xibei.hellospring.service;

import org.springframework.stereotype.Service;

//@Service("sms")
public class SMSNotificationService implements NotificationService {

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("sms" + " send[ " + message + " ]to " + recipientEmail);
    }
}
