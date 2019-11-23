package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.CategoryManagementEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryManagementRepository extends CrudRepository<CategoryManagementEntity, Integer> {
}
