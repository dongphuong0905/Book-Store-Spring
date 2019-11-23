package com.mycompany.bookstore.repositories;

import com.mycompany.bookstore.entities.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<CityEntity, Integer> {
}
