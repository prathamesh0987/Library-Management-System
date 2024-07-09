package com.example.LMS.Controller;

import com.example.LMS.Entities.User;
import com.example.LMS.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }

}
