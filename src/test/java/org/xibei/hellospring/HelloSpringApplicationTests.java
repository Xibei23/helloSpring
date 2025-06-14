package org.xibei.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.xibei.hellospring.pojo.Dog;
import org.xibei.hellospring.pojo.Person;

@SpringBootTest
class HelloSpringApplicationTests {
    @Autowired
    private Person person1;

    @Test
    void contextLoads() {
        System.out.println(person1);
        person1.getMap().forEach((k, v) -> System.out.println(k + ":" + v));
    }

}
