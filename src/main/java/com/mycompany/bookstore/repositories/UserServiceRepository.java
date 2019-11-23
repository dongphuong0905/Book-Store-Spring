package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.UserServiceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserServiceRepository extends CrudRepository<UserServiceEntity, Integer> {
}
