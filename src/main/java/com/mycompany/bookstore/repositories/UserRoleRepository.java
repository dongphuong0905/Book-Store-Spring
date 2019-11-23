package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.UserRoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRoleEntity, Integer> {
}
