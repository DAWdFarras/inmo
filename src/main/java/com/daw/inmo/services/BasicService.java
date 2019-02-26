package com.daw.inmo.services;

import com.daw.inmo.models.BaseModel;

public interface BasicService<T extends BaseModel, R> {
    T getById(R id);

    T create(T target);

    boolean removeById(R id);

    int remove(T target);

    boolean update(T target);

    boolean existsById(R id);
}
