package org.xibei.hellospring.service;

import org.springframework.stereotype.Service;


public interface NotificationService {
    void send(String message, String recipientEmail);
}
