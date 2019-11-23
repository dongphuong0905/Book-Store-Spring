package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.OrderDetailEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetailEntity, Integer> {
}
