package com.heds.creatorplatform.controller;

import com.heds.creatorplatform.entity.User;
import com.heds.creatorplatform.service.UserService;
import com.heds.creatorplatform.utils.JwtUtil;
import io.jsonwebtoken.Jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.registry.Registry;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public String GetUser(@PathVariable int id) {
        User user = userService.QueryById(id);
        if (user != null) {
            return user.toString();
        } else {
            return String.format("User(id: %s) not found", id);
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/xxx")
    public String GetTest() {
        return "1111";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/registry")
    public Boolean Registry(@RequestBody User user) {
        Boolean registryResult = userService.Registry(user);
        return registryResult;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public Boolean Login(@RequestBody User user) {
        User loginResult = userService.QueryByName(user.getName());
        if (loginResult != null) {
//            String token = JwtUtil.getJwtToken(loginResult.getPassword(), loginResult.getName());
//            System.out.println(token);
            String token = JwtUtil.generateToken(user.getName());
            System.out.println(token);
            return loginResult.getPassword().equals(user.getPassword());
        }
        return false;
    }

}
