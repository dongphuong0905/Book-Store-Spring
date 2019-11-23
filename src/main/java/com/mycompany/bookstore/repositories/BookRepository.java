package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
}
