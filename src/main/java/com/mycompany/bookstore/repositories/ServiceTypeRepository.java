package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.ServiceTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends CrudRepository<ServiceTypeEntity, Integer> {
}
