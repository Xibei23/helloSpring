package org.xibei.hellospring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.xibei.hellospring.entities.Product;
import org.xibei.hellospring.entities.User;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
