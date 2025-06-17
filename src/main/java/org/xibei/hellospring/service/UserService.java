package org.xibei.hellospring.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xibei.hellospring.entities.Category;
import org.xibei.hellospring.entities.Product;
import org.xibei.hellospring.entities.User;
import org.xibei.hellospring.repositories.CategoryRepository;
import org.xibei.hellospring.repositories.ProductRepository;
import org.xibei.hellospring.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    @Transactional
    public void saveProduct() {

        productRepository.deleteById(2L);
    }


}
