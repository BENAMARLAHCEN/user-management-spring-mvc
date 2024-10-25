package org.example.controllers;

import org.example.entities.User;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping
    public String index(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }
}
