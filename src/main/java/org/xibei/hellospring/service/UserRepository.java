package org.xibei.hellospring.service;

import org.xibei.hellospring.pojo.User;

public interface UserRepository {
    void save(User user);
}
