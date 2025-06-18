package org.xibei.hellospring.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.xibei.hellospring.entities.User;
import org.xibei.hellospring.entities.UserSummary;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select u.id as id, u.email as email from User u where u.profile.loyaltyPoints > :point order by u.email")
    List<UserSummary> findPoints(@Param("point") int point);

}
