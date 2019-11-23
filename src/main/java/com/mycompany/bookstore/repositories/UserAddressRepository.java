package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.UserAddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends CrudRepository<UserAddressEntity, Integer> {
}
