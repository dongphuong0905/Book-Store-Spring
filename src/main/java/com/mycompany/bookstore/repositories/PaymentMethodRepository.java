package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.PaymentMethodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepository extends CrudRepository<PaymentMethodEntity, Integer> {
}
