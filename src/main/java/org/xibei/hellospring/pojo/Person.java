package org.xibei.hellospring.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties("person")
public class Person {
    private String name;
    private int age;
    private boolean happy;
    private Date birthday;
    private Map<String, Object> map;
    private List<Object> list;
    private Dog dog;
}
