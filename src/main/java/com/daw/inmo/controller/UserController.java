package com.daw.inmo.controller;

import com.daw.inmo.models.User;
import com.daw.inmo.services.UserSrv;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    private UserSrv userSrv;

    @Autowired
    public UserController(UserSrv userSrv) {
        this.userSrv = userSrv;
    }

    @PostMapping(value = "/create",
    produces = "application/json",
    consumes = "application/json")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userSrv.create(user);
        ResponseEntity<User> result = new ResponseEntity<>(savedUser, HttpStatus.OK);
        log.info("Saved user: {}", savedUser.getUser());
        return result;
    }

    @GetMapping(value = "/{id}",
    produces = "application/json")
    public ResponseEntity<User> getUserById(@RequestAttribute String id) {
        User user = userSrv.getById(id);
        log.info("Retrieved user: {}", user.getUser());
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
