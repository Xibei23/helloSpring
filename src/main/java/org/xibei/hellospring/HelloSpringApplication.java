package org.xibei.hellospring;

import jdk.jfr.Frequency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.xibei.hellospring.entities.Address;
import org.xibei.hellospring.entities.Category;
import org.xibei.hellospring.entities.Product;
import org.xibei.hellospring.entities.User;
import org.xibei.hellospring.repositories.AddressRepository;
import org.xibei.hellospring.repositories.ProductRepository;
import org.xibei.hellospring.repositories.UserRepository;
import org.xibei.hellospring.service.UserService;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HelloSpringApplication.class, args);

        ProductRepository repository = applicationContext.getBean(ProductRepository.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.fetchUser();

    }

}
