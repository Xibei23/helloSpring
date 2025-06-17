package org.xibei.hellospring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.xibei.hellospring.entities.Category;
import org.xibei.hellospring.entities.Product;

public interface CategoryRepository extends CrudRepository<Category, Byte> {

}
