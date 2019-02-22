package com.daw.inmo.models;

import com.daw.inmo.database.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements BaseModel<UserEntity> {
    private String user;
    private String password;


    @Override
    public UserEntity toEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUser(this.user);
        userEntity.setPassword(this.password);
        return userEntity;
    }
}
