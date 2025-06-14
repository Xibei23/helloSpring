package org.xibei.hellospring.pojo;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String password;
    private String email;
}
