package org.xibei.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.xibei.hellospring.entities.Address;
import org.xibei.hellospring.entities.User;
import org.xibei.hellospring.repositories.AddressRepository;
import org.xibei.hellospring.repositories.UserRepository;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(HelloSpringApplication.class, args);

        UserRepository repository = applicationContext.getBean(UserRepository.class);

        AddressRepository addressRepository = applicationContext.getBean(AddressRepository.class);

        Address address = addressRepository.findById(1L).orElseThrow();

        System.out.println(address);
    }

}
