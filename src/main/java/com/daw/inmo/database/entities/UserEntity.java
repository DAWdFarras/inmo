package com.daw.inmo.database.entities;

import com.daw.inmo.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements BaseEntity<User> {

    @Id
    private String user;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Override
    public User toModel() {
        User user = new User();
        user.setUser(this.user);
        user.setPassword(this.password);
        return user;
    }
}
