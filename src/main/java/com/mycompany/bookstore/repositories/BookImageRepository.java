package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.BookImageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookImageRepository extends CrudRepository<BookImageEntity, Integer> {
}
