package org.xibei.hellospring.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xibei.hellospring.entities.Profile;
import org.xibei.hellospring.entities.UserSummary;
import org.xibei.hellospring.repositories.CategoryRepository;
import org.xibei.hellospring.repositories.ProductRepository;
import org.xibei.hellospring.repositories.ProfileRepository;
import org.xibei.hellospring.repositories.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;


    @Transactional
    public void saveProduct() {

        productRepository.deleteById(2L);
    }

    @Transactional
    public void fetchProfile() {
        List<UserSummary> list = profileRepository.findAllByLoyaltyPointsGreaterThan(2);

        list.forEach(p->{
            System.out.println(p.getId() + ":" +  p.getEmail());
        });
    }

    @Transactional
    public void fetchUser() {
        List<UserSummary> list = userRepository.findPoints(2);

        list.forEach(p->{
            System.out.println(p.getEmail());
        });
    }




}
