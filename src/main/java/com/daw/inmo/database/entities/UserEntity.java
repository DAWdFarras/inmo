package com.daw.inmo.database.entities;

import com.daw.inmo.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements BaseEntity<User> {
    @Id
    private String user;
    private String password;

    @Override
    public User toModel() {
        User user = new User();
        user.setUser(this.user);
        user.setPassword(this.password);
        return user;
    }
}
