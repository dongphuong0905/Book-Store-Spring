package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.ServiceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<ServiceEntity, Integer> {
}
