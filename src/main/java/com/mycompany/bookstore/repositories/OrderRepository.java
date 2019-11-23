package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
}
