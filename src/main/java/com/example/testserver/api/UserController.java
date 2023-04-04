package com.example.testserver.api;

import com.example.testserver.model.User;
import com.example.testserver.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/api/user",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<List<User>> getUsers(HttpServletRequest request) {

        return ResponseEntity.ok(userService.getAllUsers());
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/api/user",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<User> createNewUser(HttpServletRequest request) {
        return ResponseEntity.ok(userService.createNewUser());
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/api/user/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<User> getAccountLists(HttpServletRequest request, @PathVariable String id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}
