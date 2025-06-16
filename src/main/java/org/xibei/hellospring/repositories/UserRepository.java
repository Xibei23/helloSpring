package org.xibei.hellospring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.xibei.hellospring.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {


}
