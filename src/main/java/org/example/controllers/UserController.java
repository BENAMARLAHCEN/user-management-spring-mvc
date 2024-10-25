package org.example.controllers;

import org.example.dto.UserDto;
import org.example.entities.User;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model) {
        List<UserDto> users = userService.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        return "create-user";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id).get());
        return "edit-user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

    @PostMapping("/create")
    public String createUser(UserDto userDto) {
        userService.save(userDto);
        return "redirect:/users";
    }

//    @PostMapping("/create")
//    public String createUser(User user) {
//        userService.save(user);
//        return "redirect:/users";
//    }

    @PostMapping("/update")
    public String updateUser(UserDto userDto) {
        userService.save(userDto);
        return "redirect:/users";
    }

}
