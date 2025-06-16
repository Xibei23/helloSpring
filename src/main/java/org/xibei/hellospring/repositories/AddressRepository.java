package org.xibei.hellospring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.xibei.hellospring.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
