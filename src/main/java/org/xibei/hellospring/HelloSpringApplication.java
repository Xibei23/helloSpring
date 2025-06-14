package org.xibei.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.xibei.hellospring.entities.Address;
import org.xibei.hellospring.entities.Profile;
import org.xibei.hellospring.entities.Tag;
import org.xibei.hellospring.entities.User;

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = SpringApplication.run(HelloSpringApplication.class, args);

        var user = User.builder()
                .name("xibei")
                .email("email")
                .password("password")
                .build();

        var profile = Profile.builder()
                .bio("bio")
                .build();

        user.setProfile(profile);
        profile.setUser(user);


        System.out.println(user);
    }

}
