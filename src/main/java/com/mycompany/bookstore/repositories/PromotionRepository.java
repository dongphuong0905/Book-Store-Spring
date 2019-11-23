package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.PromotionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends CrudRepository<PromotionEntity, Integer> {
}
