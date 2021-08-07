package com.thofiq.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/userid")
    public User getById(@RequestParam String userid) {
        return this.userService.getById(userid);
    }

    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }

    @PostMapping
    public User user(@RequestBody User user) {
        return this.userService.createUser(user);
    }

}
