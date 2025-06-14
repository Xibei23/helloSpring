package org.xibei.hellospring.service;

import org.springframework.stereotype.Service;
import org.xibei.hellospring.pojo.User;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user) {
        userRepository.save(user);
        notificationService.send("register success", user.getEmail());
    }
}
