package org.xibei.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.xibei.hellospring.pojo.User;
import org.xibei.hellospring.service.NotificationManager;
import org.xibei.hellospring.service.UserService;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HelloSpringApplication.class, args);

        var service = applicationContext.getBean(UserService.class);
        User user = new User();
        user.setId(1);
        user.setEmail("qq.com");
        service.registerUser(user);
    }

}
