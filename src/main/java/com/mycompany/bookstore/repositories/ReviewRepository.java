package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.ReviewEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<ReviewEntity, Integer> {
}
