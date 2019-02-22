package com.daw.inmo.database.entities;

import com.daw.inmo.models.BaseModel;

public interface BaseEntity<T extends BaseModel> {

    T toModel();

}
