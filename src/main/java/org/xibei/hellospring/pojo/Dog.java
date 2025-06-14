package org.xibei.hellospring.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("person.dog")
public class Dog {
    private String name;
    private int age;
}
