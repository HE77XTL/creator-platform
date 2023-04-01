package com.heds.creatorplatform.controller;

import com.heds.creatorplatform.entity.User;
import com.heds.creatorplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.registry.Registry;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public String GetUser(@PathVariable int id){
        User user = userService.QueryById(id);
        if (user != null) {
            return user.toString();
        } else {
            return String.format("User(id: %s) not found", id);
        }
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/xxx")
    public String GetTest(){
        return "1111";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/registry")
    public Boolean Registry(@RequestBody User user){
        Boolean registryResult = userService.Registry(user);
        return registryResult;
    }

    public String Login() {
        return "";
    }

}
