package com.daw.inmo.models;

import com.daw.inmo.database.entities.BaseEntity;

public interface BaseModel<T extends BaseEntity> {

    T toEntity();

}
