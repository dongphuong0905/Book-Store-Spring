package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.OrderStatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends CrudRepository<OrderStatusEntity, Integer> {
}
