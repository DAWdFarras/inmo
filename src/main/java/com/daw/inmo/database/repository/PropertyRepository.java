package com.daw.inmo.database.repository;

import com.daw.inmo.database.entities.PropertyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository <PropertyEntity, Long> {
}
