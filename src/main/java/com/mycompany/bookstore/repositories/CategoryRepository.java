package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer> {

}
