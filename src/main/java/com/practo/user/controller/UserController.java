package com.practo.user.controller;

import com.practo.user.entities.User;
import com.practo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON_VALUE)
@Path("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GET
    @Path("/list")
    public ResponseEntity<List<User>> listAll(){
        return new ResponseEntity<>(userService.listAllUsers(), HttpStatus.OK);
    }

    @GET
    @Path("compute-fib/{num}")
    public ResponseEntity<Integer> fibonacci(@PathParam("num") int n) {
        return new ResponseEntity<>(userService.computeFibonacci(n), HttpStatus.OK);
    }
}
