package com.example.simpleroot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return "Simple-Root";
    }

    @PostMapping("/saveUser")
    public String saveUser() {
        return "User Saved!";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "user Updated!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted!";
    }
}
