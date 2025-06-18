package org.xibei.hellospring.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.xibei.hellospring.entities.Profile;
import org.xibei.hellospring.entities.UserSummary;

import java.util.List;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

    @Query("select p.id as id, p.user.email as email from Profile p where p.loyaltyPoints > :point order by p.user.email desc ")
    @EntityGraph(attributePaths = "user")
    List<UserSummary> findAllByLoyaltyPointsGreaterThan(@Param("point") int point);
}