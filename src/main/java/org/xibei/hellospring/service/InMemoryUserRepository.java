package org.xibei.hellospring.service;

import org.springframework.stereotype.Repository;
import org.xibei.hellospring.pojo.User;

@Repository
public class InMemoryUserRepository implements UserRepository {
    @Override
    public void save(User user) {
        System.out.println("InMemoryUserRepository save user");
    }
}
