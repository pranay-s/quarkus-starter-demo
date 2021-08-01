package com.practo.user.controller;

import com.practo.user.entities.User;
import com.practo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> listAll(){
        return new ResponseEntity<>(userService.listAllUsers(), HttpStatus.OK);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Map<String, Boolean>> createUser(User user) {
        Map<String, Boolean> result = new HashMap<>();
        result.put("created", userService.createUser(user));
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
