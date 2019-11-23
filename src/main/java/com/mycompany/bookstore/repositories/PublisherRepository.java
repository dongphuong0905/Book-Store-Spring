package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.PublisherEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<PublisherEntity, Integer> {
}
