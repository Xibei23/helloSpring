package org.xibei.hellospring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.xibei.hellospring.service.EmailNotificationService;
import org.xibei.hellospring.service.NotificationManager;
import org.xibei.hellospring.service.SMSNotificationService;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public EmailNotificationService email() {
        return new EmailNotificationService();
    }

    @Bean
    public SMSNotificationService sms() {
        return new SMSNotificationService();
    }

    @Value("${notify.type:email}")
    public String serviceType;

    @Bean
    public NotificationManager manager() {
        if (serviceType.equalsIgnoreCase("sms")) {
            return new NotificationManager(sms());
        } else if (serviceType.equalsIgnoreCase("email")) {
            return new NotificationManager(email());
        }
        return null;
    }

}
