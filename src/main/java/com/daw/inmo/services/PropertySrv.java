package com.daw.inmo.services;

import com.daw.inmo.database.entities.PropertyEntity;
import com.daw.inmo.database.repository.PropertyRepository;
import com.daw.inmo.models.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertySrv implements BasicService<Property, Long> {
    private PropertyRepository propertyRepository;

    @Autowired
    public PropertySrv(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property getById(Long id) {
        return propertyRepository
                .findById(id)
                .map(PropertyEntity::toModel)
                .orElseThrow(() -> new IllegalArgumentException("Found no elements!!!"));
    }

    @Override
    public Property create(Property target) {
        return propertyRepository.save(target.toEntity()).toModel();
    }

    @Override
    public boolean removeById(Long id) {
        propertyRepository.deleteById(id);
        return true;
    }

    @Override
    public int remove(Property target) {
        return 0;
    }

    @Override
    public boolean update(Property target) {
        return false;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}
